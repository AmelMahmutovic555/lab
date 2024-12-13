package mk.ukim.finki.wp.lab.repository;

import mk.ukim.finki.wp.lab.model.Album;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface AlbumRepository extends JpaRepository<Album, Long> {
}
