package entity;

import jakarta.persistence.*;
import jdk.jfr.Name;

import java.io.Serializable;

@Entity
@Table(name = "albums")
@NamedQueries({@NamedQuery(name = "Album.findAll", query = "select e from Album e order by e.title"),
               @NamedQuery(name = "Album.findByArtist", query = "select e from Album e where e.artist = :artist"),
               @NamedQuery(name = "Album.findById", query = "select e from Album e where e.id = :id"),
})
public class Album {
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY, generator = "id")
    @Column(name = "id")
    private Integer id;

    @Column(name = "releaseyear")
    private Integer releaseYear;

    @Column(name = "title")
    private String title;

    @Column(name = "artist")
    private String artist;

    @Column(name = "genre")
    private String genre;

    public Album() {

    }

    public Album(Integer id, Integer releaseYear, String title, String artist, String genre) {
        this.id = id;
        this.releaseYear = releaseYear;
        this.title = title;
        this.artist = artist;
        this.genre = genre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Integer releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Album{" +
                "id=" + id +
                ", releaseYear=" + releaseYear +
                ", title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}
