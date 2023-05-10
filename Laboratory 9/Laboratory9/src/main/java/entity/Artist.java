package entity;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "artists")
@NamedQueries({@NamedQuery(name = "Artist.findAll", query = "select e from Artist e order by e.name"),})
public class Artist implements Serializable {
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY, generator = "id")
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    public Artist() {

    }
    public Artist(Integer id, String name) {
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

    @Override
    public String toString() {
        return "Artist{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public void TestJPA() {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Artist artist = new Artist(2,"Beatles");
        artist.getId();
        entityManager.persist(artist);
        Artist a = (Artist)entityManager.createQuery("select e from Artist e where e.name='Beatles'").getSingleResult();
        a.setName("The Beatles");
        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();
    }
}
