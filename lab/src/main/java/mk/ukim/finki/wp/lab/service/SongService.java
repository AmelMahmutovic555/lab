package mk.ukim.finki.wp.lab.service;

import mk.ukim.finki.wp.lab.model.Artist;
import mk.ukim.finki.wp.lab.model.Song;

import java.util.List;

public interface SongService {
    List<Song> listSongs();
    Artist addArtistToSong(Artist artist, Song song);
    Song findByTrackId(String trackId);
    void saveSong(String title, String trackId, String genre, int releaseYear, Long albumId);
    void editSong(Long songId, String title, String trackId, String genre, int releaseYear, Long albumId);
    void deleteSong(Long id);
    Song findById(Long id);
}
