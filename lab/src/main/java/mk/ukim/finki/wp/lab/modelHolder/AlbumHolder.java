package mk.ukim.finki.wp.lab.modelHolder;

import jakarta.annotation.PostConstruct;
import mk.ukim.finki.wp.lab.model.Album;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AlbumHolder {
    public static List<Album> albumList = new ArrayList<>();

    @PostConstruct
    public void init(){
        albumList.add(new Album(1L,"AlbumName1", "Pop", "2010"));
        albumList.add(new Album(2L,"AlbumName2", "Pop", "2005"));
        albumList.add(new Album(3L,"AlbumName3", "Pop", "2013"));
        albumList.add(new Album(4L,"AlbumName4", "Pop", "2020"));
        albumList.add(new Album(5L,"AlbumName5", "Pop", "2015"));
    }
}
