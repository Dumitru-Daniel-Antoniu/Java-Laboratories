package com.mycompany.compulsory;

import java.io.*;

@Entity
@Table(name = "artists")
@NamedQueries({@NamedQuery(name = "Artist.findAll", query = "select e from Artist e order by e.name"),})
public class Artist implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "id")
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String name;
}
