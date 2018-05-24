package com.ibntofail.rhmanager.model;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
public class Departement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="departement_id")
    private Long id;

    @Column
    private String nom;

    @Column
    private String nomChefDepartement;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "departement_id")
    private Collection<Personne> personnes = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNomChefDepartement() {
        return nomChefDepartement;
    }

    public void setNomChefDepartement(String nomChefDepartement) {
        this.nomChefDepartement = nomChefDepartement;
    }

    public Collection<Personne> getPersonnes() {
        return personnes;
    }

    public void setPersonnes(Collection<Personne> personnes) {
        this.personnes = personnes;
    }
}
