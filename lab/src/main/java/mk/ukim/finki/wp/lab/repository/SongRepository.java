package mk.ukim.finki.wp.lab.repository;

import mk.ukim.finki.wp.lab.model.Artist;
import mk.ukim.finki.wp.lab.model.Song;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface SongRepository extends JpaRepository<Song, Long> {
//    Song findByTrackId(String trackId);

    //    Song findByTrackId(String trackId);
    List<Song> findAllByAlbum_Id(Long albumId);
//    List<Song> findAllByIdString trackId);
//    Artist addArtistToSong(Artist artist, Song song);
//    Optional<Song> findById(Long id);
//    Song save(Song song);
}
