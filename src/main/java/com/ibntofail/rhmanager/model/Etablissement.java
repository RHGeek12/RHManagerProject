package com.ibntofail.rhmanager.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
public class Etablissement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="etablissement_id")
    private long id;

    @Column
    private String nom;

    @OneToMany
    @JoinColumn(name = "etablisement_id")
    private Collection<Departement> departements = new ArrayList<>();

    @OneToMany
    @JoinColumn(name = "etablisement_id")
    private Collection<ServiceAdministratif> servicesAdministratif = new ArrayList<>();

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Collection<Departement> getDepartements() {
        return departements;
    }

    public void setDepartements(Collection<Departement> departements) {
        this.departements = departements;
    }

    public Collection<ServiceAdministratif> getServicesAdministratif() {
        return servicesAdministratif;
    }

    public void setServicesAdministratif(Collection<ServiceAdministratif> servicesAdministratif) {
        this.servicesAdministratif = servicesAdministratif;
    }
}
