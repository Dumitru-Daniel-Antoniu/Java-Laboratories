import entity.Artist;
import entity.Album;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

import java.lang.*;
import java.io.Serializable;
import java.util.List;

public class AlbumRepository {
    private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;

    public AlbumRepository() {
        this.entityManagerFactory = Persistence.createEntityManagerFactory("default");
        this.entityManager = entityManagerFactory.createEntityManager();
    }

    public void create(Album album) {
        this.entityManager.getTransaction().begin();
        entityManager.persist(album);
        entityManager.getTransaction().commit();
    }

    public List<Album> findAll() {
        return entityManager.createNamedQuery("Album.findAll").getResultList();
    }
    public Album findById(Integer id) {
        Query query = entityManager.createNamedQuery("Album.findById");
        query.setParameter("id",id);
        return (Album) query.getSingleResult();
    }

    public List<Album> findByArtist(Artist artist) {
        return entityManager.createNamedQuery("Album.findByArtist").setParameter("artist",artist).getResultList();
    }

    public Album addArtist(Integer id, Artist author) {
        entityManager.getTransaction().begin();
        Album album = findById(id);
        album.setAuthor(author);
        entityManager.getTransaction().commit();
        return album;
    }

    public void close() {
        entityManager.close();
        entityManagerFactory.close();
    }
}
