package mk.ukim.finki.wp.lab.modelHolder;

import jakarta.annotation.PostConstruct;
import mk.ukim.finki.wp.lab.model.Album;
import mk.ukim.finki.wp.lab.model.Song;
import mk.ukim.finki.wp.lab.repository.AlbumRepository;
import mk.ukim.finki.wp.lab.repository.SongRepository;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class SongHolder {
    public static List<Song> songList = null;

    private final SongRepository songRepository;
    private final AlbumRepository albumRepository; // Add dependency for AlbumRepository

    public SongHolder(SongRepository songRepository, AlbumRepository albumRepository) {
        this.songRepository = songRepository;
        this.albumRepository = albumRepository;
    }

    @PostConstruct
    public void init() {
        songList = new ArrayList<>();

        if (this.songRepository.count() == 0) {
            // Save albums first to ensure they are persistent
            Album album1 = albumRepository.save(new Album("AlbumName1", "Pop", "2010"));
            Album album2 = albumRepository.save(new Album("AlbumName2", "Pop", "2005"));
            Album album3 = albumRepository.save(new Album("AlbumName3", "Pop", "2013"));
            Album album4 = albumRepository.save(new Album("AlbumName4", "Pop", "2020"));
            Album album5 = albumRepository.save(new Album("AlbumName5", "Pop", "2015"));

            // Create songs with the saved albums
            songRepository.save(new Song("1", "Faded", "Electro", 2017, album1));
            songRepository.save(new Song("2", "Shape of you", "Pop", 2017, album2));
            songRepository.save(new Song("3", "Despacito", "Pop", 2017, album3));
            songRepository.save(new Song("4", "That's What I Like", "Pop", 2017, album4));
            songRepository.save(new Song("5", "Humble", "Rap", 2017, album5));
        }
    }
}
