package mk.ukim.finki.wp.lab.modelHolder;

import jakarta.annotation.PostConstruct;
import mk.ukim.finki.wp.lab.model.Album;
import mk.ukim.finki.wp.lab.repository.AlbumRepository;
import mk.ukim.finki.wp.lab.repository.AlbumRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AlbumHolder {
    public static List<Album> albumList = new ArrayList<>();
    private final AlbumRepository albumRepository;

    public AlbumHolder(AlbumRepository albumRepository) {
        this.albumRepository = albumRepository;
    }

    @PostConstruct
    public void init(){

        albumRepository.save(new Album(1,1,2010));
        albumRepository.save(new Album(2, 2, 2010));
        albumRepository.save(new Album(3, 3, 2013));
        albumRepository.save(new Album(4, 4, 2020));
        albumRepository.save(new Album(5, 5, 2015));
    }
}
