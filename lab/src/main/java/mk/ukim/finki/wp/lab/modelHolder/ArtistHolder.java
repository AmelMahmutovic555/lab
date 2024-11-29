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
        performers.add(new Artist(1L, "Alan", "Walker", "A great artist"));
        performers.add(new Artist(2L, "Ed", "Sheeran", "A great artist"));
        performers.add(new Artist(3L, "Luis", "Fonsi", "A great artist"));
        performers.add(new Artist(4L, "Bruno", "Mars", "A great artist"));
        performers.add(new Artist(5L, "Kendrick", "Lamar", "A great artist"));
    }
}
