package mk.ukim.finki.wp.lab.repository;

import mk.ukim.finki.wp.lab.model.Artist;
import mk.ukim.finki.wp.lab.modelHolder.ArtistHolder;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ArtistRepository {
//    List<Artist> performers = null;

    public List<Artist> findAll(){
        return ArtistHolder.performers;
    }

    public Optional<Artist> findById(Long id){
        return ArtistHolder.performers.stream().filter(ID -> ID.getId().equals(id)).findFirst();
    }

    public void save(Artist artist) {
        this.findById(artist.getId()).ifPresentOrElse(
                existingArtist -> {
                    existingArtist.setFirstName(artist.getFirstName());
                    existingArtist.setLastName(artist.getLastName());
                    existingArtist.setBio(artist.getBio());
                },
                () -> ArtistHolder.performers.add(artist)
        );
    }
}
