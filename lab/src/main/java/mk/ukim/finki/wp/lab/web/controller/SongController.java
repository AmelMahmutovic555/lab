package mk.ukim.finki.wp.lab.web.controller;

//import ch.qos.logback.core.model.Model;
import mk.ukim.finki.wp.lab.model.Album;
import mk.ukim.finki.wp.lab.model.Artist;
import mk.ukim.finki.wp.lab.model.Song;
import mk.ukim.finki.wp.lab.service.AlbumService;
import mk.ukim.finki.wp.lab.service.ArtistService;
import mk.ukim.finki.wp.lab.service.SongService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/songs")
public class SongController {
    private final SongService songService;
    private final AlbumService albumService;
    private final ArtistService artistService;

    public SongController(SongService songService, AlbumService albumService, ArtistService artistService) {
        this.songService = songService;
        this.albumService = albumService;
        this.artistService = artistService;
    }

    @GetMapping
    public String getSongsPage(@RequestParam(required = false) String error, Model model) {
        model.addAttribute("songs", songService.listSongs());
        model.addAttribute("albums", albumService.findAll());
        model.addAttribute("error", error);
        return "listSongs";
    }

    @GetMapping("/delete/{id}")
    public String deleteSong(@PathVariable Long id) {
        songService.deleteSong(id);
        return "redirect:/songs";
    }

    @GetMapping("/add-form")
    public String getAddSongPage(Model model) {
        model.addAttribute("albums", albumService.findAll());
        return "add-song";
    }

    @GetMapping("/edit-form/{id}")
    public String getEditSongForm(@PathVariable Long id, Model model) {
        Song song = songService.findById(id);
        if (song == null) {
            return "redirect:/songs?error=SongNotFound";
        }
        model.addAttribute("song", song);
        model.addAttribute("albums", albumService.findAll());
        return "add-song";
    }

    @GetMapping("/login")
    public String getLoginPage(){
        return "login";
    }

    @PostMapping("/add")
    public String saveSong(
            @RequestParam String trackId,
            @RequestParam String title,
            @RequestParam String genre,
            @RequestParam int releaseYear,
            @RequestParam Long albumId
            ) {
        Album album = albumService.findById(albumId)
                .orElseThrow(() -> new IllegalArgumentException("Invalid album ID"));
        Song song = new Song(trackId, title, genre, releaseYear, album);
        songService.saveSong(song);
        return "redirect:/songs";
    }

    @PostMapping("/edit/{songId}")
    public String editSong(
            @PathVariable Long songId,
            @RequestParam String trackId,
            @RequestParam String title,
            @RequestParam String genre,
            @RequestParam int releaseYear,
            @RequestParam Long albumId
            ) {
        Album album = albumService.findById(albumId)
                .orElseThrow(() -> new IllegalArgumentException("Invalid album ID"));        Song song = new Song(trackId, title, genre, releaseYear, album);
        song.setId(songId); // Ensure the ID is preserved for editing
        songService.editSong(song);
        return "redirect:/songs";
    }

    @PostMapping
    public String artistRedirect(){
        return "artistsList";
    }

    @PostMapping("/login")
    public String addLoginDetails(Model model){
        String username = (String) model.getAttribute("username");
        String password = (String) model.getAttribute("password");
        if (username=="admin" && password=="admin"){
            return "redirect:/songs";
        }
        return "redirect:/songs/login";
    }
}
