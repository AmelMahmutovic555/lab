package mk.ukim.finki.wp.lab.repository;

import mk.ukim.finki.wp.lab.model.Album;
import mk.ukim.finki.wp.lab.modelHolder.AlbumHolder;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class AlbumRepository {

    public List<Album> findAll(){
        return AlbumHolder.albumList;
    }

    public Optional<Album> findById(Long id) {
        return AlbumHolder.albumList.stream()
                .filter(album -> album.getId().equals(id))
                .findFirst();
    }
}