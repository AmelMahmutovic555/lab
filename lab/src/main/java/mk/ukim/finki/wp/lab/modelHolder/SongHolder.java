package mk.ukim.finki.wp.lab.modelHolder;

import jakarta.annotation.PostConstruct;
import mk.ukim.finki.wp.lab.model.Album;
import mk.ukim.finki.wp.lab.model.Artist;
import mk.ukim.finki.wp.lab.model.Song;
import mk.ukim.finki.wp.lab.repository.SongRepository;
import mk.ukim.finki.wp.lab.repository.SongRepositoryImpl;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class SongHolder extends SongRepositoryImpl {
    public static List<Song> songList = new ArrayList<>();

    private final SongRepository songRepository;

    public SongHolder(SongRepository songRepository) {
        this.songRepository = songRepository;
    }

    @PostConstruct
    public void init(){

//        songRepository.save(new Song("1","Faded", "Electro", 2017, new Album("AlbumName1", "Pop", "2010")));
//        songRepository.save(new Song("2","Shape of you", "Pop", 2017, new Album("AlbumName2", "Pop", "2005")));
//        songRepository.save(new Song("3","Despacito", "Pop", 2017, new Album("AlbumName3", "Pop", "2013")));
//        songRepository.save(new Song("4","That's What I Like", "Pop", 2017, new Album("AlbumName4", "Pop", "2020")));
//        songRepository.save(new Song("5","Humble", "Rap", 2017, new Album("AlbumName5", "Pop", "2015")));

        songRepository.save(new Song(1, 1, 2017));
        songRepository.save(new Song(2, 2, 2017));
        songRepository.save(new Song(3, 3, 2017));
        songRepository.save(new Song(3, 3, 2017));
        songRepository.save(new Song(4, 4, 2017));
    }
}
