package mk.ukim.finki.wp.lab.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@Data
@Entity
public class Song {
    @Id
    @GeneratedValue
    private Long id;

//    @Column(columnDefinition = "TEXT")
//    @Transient
//    private String trackId;

//    @Column(columnDefinition = "TEXT")
    private int title;

//    @Column(columnDefinition = "TEXT")
    private int genre;

    private int releaseYear;

//    @ManyToMany
//    private List<Artist> performers;
//
//    @ManyToOne
//    private Album album;

//    public Song(String trackId, String title, String genre, int releaseYear, Album album) {
//        this.trackId = trackId;
//        this.title = title;
//        this.genre = genre;
//        this.releaseYear = releaseYear;
////        this.performers = performers;
//        this.album = album;
//    }

    public Song(int title, int genre, int releaseYear) {
        this.title = title;
        this.genre = genre;
        this.releaseYear = releaseYear;
    }

//    public String getTrackId() {
//        return trackId;
//    }
//
//    public void setTrackId(String trackId) {
//        this.trackId = trackId;
//    }

    public int getTitle() {
        return title;
    }

    public void setTitle(int title) {
        this.title = title;
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

//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
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
//    public int getReleaseYear() {
//        return releaseYear;
//    }
//
//    public void setReleaseYear(int releaseYear) {
//        this.releaseYear = releaseYear;
//    }

//    public List<Artist> getPerformers() {
//        return performers;
//    }
//
//    public void setPerformers(List<Artist> performers) {
//        this.performers = performers;
//    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
