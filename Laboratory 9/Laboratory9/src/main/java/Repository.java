import entity.Artist;
import entity.Album;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

import java.lang.*;
import java.io.Serializable;
import java.util.List;

public class Repository {
    private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;

    public Repository() {
        this.entityManagerFactory = Persistence.createEntityManagerFactory("default");
        this.entityManager = entityManagerFactory.createEntityManager();
    }

    public void create(Artist artist) {
        this.entityManager.getTransaction().begin();
        entityManager.persist(artist);
        entityManager.getTransaction().commit();
    }

    public Album findById(Integer id) {
        Query query = entityManager.createNamedQuery("Album.findById");
        query.setParameter("id",id);
        return (Album) query.getSingleResult();
    }

    public List<Album> findByArtist(Artist artist) {
        return entityManager.createNamedQuery("Album.findByArtist").setParameter("artist",artist).getResultList();
    }
}
