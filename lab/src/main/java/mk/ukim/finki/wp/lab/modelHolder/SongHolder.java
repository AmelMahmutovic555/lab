package mk.ukim.finki.wp.lab.modelHolder;

import jakarta.annotation.PostConstruct;
import mk.ukim.finki.wp.lab.model.Album;
import mk.ukim.finki.wp.lab.model.Artist;
import mk.ukim.finki.wp.lab.model.Song;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class SongHolder {
    public static List<Song> songList = new ArrayList<>();

    @PostConstruct
    public void init(){
        songList.add(new Song(1L, "1","Faded", "Electro", 2017, ArtistHolder.performers, new Album(1L,"AlbumName1", "Pop", "2010")));
        songList.add(new Song(2L, "2","Shape of you", "Pop", 2017, ArtistHolder.performers, new Album(1L,"AlbumName2", "Pop", "2005")));
        songList.add(new Song(3L, "3","Despacito", "Pop", 2017, ArtistHolder.performers, new Album(1L,"AlbumName3", "Pop", "2013")));
        songList.add(new Song(4L, "4","That's What I Like", "Pop", 2017, ArtistHolder.performers, new Album(1L,"AlbumName4", "Pop", "2020")));
        songList.add(new Song(5L, "5","Humble", "Rap", 2017, ArtistHolder.performers, new Album(1L,"AlbumName5", "Pop", "2015")));
    }
}
