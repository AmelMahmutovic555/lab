package mk.ukim.finki.wp.lab.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@Data
@Entity
public class Album {
    @Id
    @GeneratedValue
    private Long id;

//    @Column(columnDefinition = "TEXT")
    private int name;

//    @Column(columnDefinition = "TEXT")
    private int genre;

//    @Column(columnDefinition = "TEXT")
    private int releaseYear;

//    @OneToMany(mappedBy = "album")
//    private List<Song> song;


//    public Album(String name, String genre, String releaseYear) {
//        this.name = name;
//        this.genre = genre;
//        this.releaseYear = releaseYear;
////        this.song = song;
//    }

    public Album(int name, int genre, int releaseYear) {
        this.name = name;
        this.genre = genre;
        this.releaseYear = releaseYear;
//        this.song = song;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public int getGenre() {
        return genre;
    }

    public void setGenre(int genre) {
        this.genre = genre;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    //    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getGenre() {
//        return genre;
//    }
//
//    public void setGenre(String genre) {
//        this.genre = genre;
//    }
//
//    public String getReleaseYear() {
//        return releaseYear;
//    }
//
//    public void setReleaseYear(String releaseYear) {
//        this.releaseYear = releaseYear;
//    }
}
