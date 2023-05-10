package entity;

import jakarta.persistence.*;
import java.util.Set;
import java.util.HashMap;
import java.util.HashSet;

@Entity
@Table(name = "genres")
public class Genre {
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY, generator = "id")
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @ManyToMany(mappedBy = "genres")
    private Set<Album> albums = new HashSet<>();

    public Genre() {
    }

    public Genre(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(Set<Album> albums) {
        this.albums = albums;
    }

    public void addAlbum(Album album) {
        boolean add = albums.add(album);
        if(add) {
            album.getGenres().add(this);
        }
    }

    public void removeAlbum(Album album) {
        boolean remove = albums.remove(album);
        if(remove) {
            album.getGenres().remove(this);
        }
    }

    @Override
    public String toString() {
        return "Genre{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", albums=" + albums +
                '}';
    }
}
