import entity.Artist;
import entity.Album;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

import java.lang.*;
import java.io.Serializable;
import java.util.List;

public class ArtistRepository {
    private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;

    public ArtistRepository() {
        this.entityManagerFactory = Persistence.createEntityManagerFactory("default");
        this.entityManager = entityManagerFactory.createEntityManager();
    }

    public void create(Artist artist) {
        this.entityManager.getTransaction().begin();
        entityManager.persist(artist);
        entityManager.getTransaction().commit();
    }

    public List<Artist> findAll() {
        return entityManager.createNamedQuery("Artist.findAll").getResultList();
    }
    public Artist findById(Integer id) {
        Query query = entityManager.createNamedQuery("Artist.findById");
        query.setParameter("id",id);
        return (Artist) query.getSingleResult();
    }

    public Artist findByName(String name) {
        Query query = entityManager.createNamedQuery("Artist.findByName");
        query.setParameter("name",name);
        return (Artist) query.getSingleResult();
    }

    public void close() {
        entityManager.close();
        entityManagerFactory.close();
    }
}