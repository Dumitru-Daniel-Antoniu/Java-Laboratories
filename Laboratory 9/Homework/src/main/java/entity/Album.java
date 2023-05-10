package entity;

import jakarta.persistence.*;
import jdk.jfr.Name;

import java.io.Serializable;
import java.util.Set;
import java.util.HashSet;

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

    @OneToOne
    private Artist author;

    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinTable(
            name = "associative",
            joinColumns = { @JoinColumn(name = "id_album")},
            inverseJoinColumns = { @JoinColumn(name = "id_genre")},
            uniqueConstraints = {
                    @UniqueConstraint(
                            columnNames = {"id_album", "id_genre"}
                    )
            }
    )
    private Set<Genre> genres = new HashSet<>();

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

    public Artist getAuthor() {
        return author;
    }

    public void setAuthor(Artist author) {
        this.author = author;
    }

    public Set<Genre> getGenres() {
        return genres;
    }

    public void setGenres(Set<Genre> genres) {
        this.genres = genres;
    }

    public void addGenre(Genre genre) {
        boolean add = genres.add(genre);
        if(add) {
            genre.getAlbums().add(this);
        }
    }

    public void removeGenre(Genre genre) {
        boolean remove = genres.remove(genre);
        if(remove) {
            genre.getAlbums().remove(this);
        }
    }

    @Override
    public String toString() {
        return "Album{" +
                "id=" + id +
                ", releaseYear=" + releaseYear +
                ", title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", genre='" + genre + '\'' +
                ", author=" + author +
                ", genres=" + genres +
                '}';
    }
}