package mk.ukim.finki.wp.lab.service;

import mk.ukim.finki.wp.lab.model.Artist;
import mk.ukim.finki.wp.lab.model.Song;

import java.util.List;

public interface SongService {
    List<Song> listSongs();
    Artist addArtistToSong(Artist artist, Song song);
//    Song findByTrackId(String trackId);
    void saveSong(Song song);
    void editSong(Song song);
    void deleteSong(Long id);
    Song findById(Long id);
    List<Song> findAllByAlbum_Id(Long albumId);
}
