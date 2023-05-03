package com.mycompany.compulsory;

public class testJPA() {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("Example");
    EntityManager em = emf.createEntityManager();
    em.getTransaction().begin;
    Artist artist = new Artist("Beatles");
    em.persist(artist);
    Artist a = (Artist)em.createQuery("select e from Artist e where e.name='Beatles'").getSingleResult();
    a.setName("The Beatles");
    em.getTransaction().commit();
    em.close();
    emf.close();
}
