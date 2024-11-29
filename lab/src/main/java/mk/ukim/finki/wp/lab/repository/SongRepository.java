package mk.ukim.finki.wp.lab.repository;

import mk.ukim.finki.wp.lab.model.Artist;
import mk.ukim.finki.wp.lab.model.Song;
import mk.ukim.finki.wp.lab.modelHolder.SongHolder;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static mk.ukim.finki.wp.lab.modelHolder.SongHolder.songList;

@Repository
public class SongRepository {

    public List<Song> findAll(){
        return songList;
    }

    public Song findByTrackId(String trackId){
        return songList.stream().filter(id -> id.getTrackId().equals(trackId)).findFirst().orElse(null);
    }

    public Artist addArtistToSong(Artist artist, Song song){
        song.getPerformers().add(artist);
        return artist;
    }

    public Optional<Song> findById(Long id) {
        return SongHolder.songList.stream()
                .filter(song -> song.getId().equals(id))
                .findFirst();
    }

    public void save(Song song) {
        // If song already exists, update it; otherwise, add a new song.
        this.findById(song.getId()).ifPresentOrElse(
                existingSong -> {
                    existingSong.setTitle(song.getTitle());
                    existingSong.setGenre(song.getGenre());
                    existingSong.setReleaseYear(song.getReleaseYear());
                    existingSong.setAlbum(song.getAlbum());
                },
                () -> SongHolder.songList.add(song)
        );
    }

    public void deleteById(Long id) {
        SongHolder.songList.removeIf(song -> song.getId().equals(id));
    }
}
