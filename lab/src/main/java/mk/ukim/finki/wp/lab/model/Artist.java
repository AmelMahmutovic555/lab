package mk.ukim.finki.wp.lab.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Entity
public class Artist {
    @Id
    @GeneratedValue
    private Long id;
//    private String firstName;
//    private String lastName;
//    private String bio;

    private int firstName;
    private int lastName;
    private int bio;

//    public Artist(String firstName, String lastName, String bio) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.bio = bio;
//    }

    public Artist(int firstName, int lastName, int bio) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.bio = bio;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getFirstName() {
        return firstName;
    }

    public void setFirstName(int firstName) {
        this.firstName = firstName;
    }

    public int getLastName() {
        return lastName;
    }

    public void setLastName(int lastName) {
        this.lastName = lastName;
    }

    public int getBio() {
        return bio;
    }

    public void setBio(int bio) {
        this.bio = bio;
    }

    //    public String getFirstName() {
//        return firstName;
//    }
//
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//
//    public String getBio() {
//        return bio;
//    }
//
//    public void setBio(String bio) {
//        this.bio = bio;
//    }
}
