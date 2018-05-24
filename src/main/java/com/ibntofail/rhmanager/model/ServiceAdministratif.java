package com.ibntofail.rhmanager.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
@Table(name = "SERVICE_ADMINISTRATIF")
public class ServiceAdministratif {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "service_administratif_id")
    private Long id;

    private String nom;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "service_administratif_id")
    private Collection<PersonneAdministratif> personnesAdministratif = new ArrayList<>();

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

    public Collection<PersonneAdministratif> getPersonnesAdministratif() {
        return personnesAdministratif;
    }

    public void setPersonnesAdministratif(Collection<PersonneAdministratif> personnesAdministratif) {
        this.personnesAdministratif = personnesAdministratif;
    }
}
