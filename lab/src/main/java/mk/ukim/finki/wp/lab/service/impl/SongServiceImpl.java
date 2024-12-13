package mk.ukim.finki.wp.lab.service.impl;

import mk.ukim.finki.wp.lab.model.Album;
import mk.ukim.finki.wp.lab.model.Artist;
import mk.ukim.finki.wp.lab.model.Song;
import mk.ukim.finki.wp.lab.repository.*;
import mk.ukim.finki.wp.lab.service.SongService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static mk.ukim.finki.wp.lab.modelHolder.SongHolder.songList;

@Service
public class SongServiceImpl implements SongService {
    private final SongRepository songRepository;
    private final AlbumRepository albumRepository;

    public SongServiceImpl(SongRepository songRepository, AlbumRepository albumRepository) {
        this.songRepository = songRepository;
        this.albumRepository = albumRepository;
    }

    @Override
    public List<Song> listSongs() {
        return songRepository.findAll();
    }

    @Override
    public Artist addArtistToSong(Artist artist, Song song) {
        return null;
    }


//    @Override
//    public Song findByTrackId(String trackId) {
//        return songRepository.findByTrackId(trackId);
//    }

    @Override
    public void saveSong(Song song) {
        songRepository.save(song);
    }

    @Override
    public void editSong(Song song) {
        songRepository.save(song);
    }

    @Override
    public void deleteSong(Long id) {
        songRepository.deleteById(id);
    }

    @Override
    public Song findById(Long id) {
        return songRepository.getReferenceById(id);
    }

    @Override
    public List<Song> findAllByAlbum_Id(Long albumId) {
        return songRepository.findAllByAlbum_Id(albumId);
    }
}