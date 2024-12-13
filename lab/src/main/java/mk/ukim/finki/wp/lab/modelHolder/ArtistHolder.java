package mk.ukim.finki.wp.lab.modelHolder;

import jakarta.annotation.PostConstruct;
import mk.ukim.finki.wp.lab.model.Artist;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ArtistHolder {

    public static List<Artist> performers = new ArrayList<>();

    @PostConstruct
    public void init(){
        performers.add(new Artist(1, 1, 1));
        performers.add(new Artist(2, 2, 2));
        performers.add(new Artist(3, 3, 3));
        performers.add(new Artist(4, 4, 4));
        performers.add(new Artist(5, 5, 5));
    }
}
