package com.ibntofail.rhmanager.model;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
public class Universite {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="universite_id")
    private Long id;

    @Column
    private String nom;

    @Column
    private String ville;

    @OneToOne(fetch = FetchType.LAZY)
    @MapsId
    private Presidence presidence;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "universite_id")
    private Collection<Etablissement> Etablissements = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVille() {
        return ville;
    }

    public String getNom() {
        return nom;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Presidence getPresidence() {
        return presidence;
    }

    public void setPresidence(Presidence presidence) {
        this.presidence = presidence;
    }

    public Collection<Etablissement> getEtablissements() {
        return Etablissements;
    }

    public void setEtablissements(Collection<Etablissement> etablissements) {
        Etablissements = etablissements;
    }
}
