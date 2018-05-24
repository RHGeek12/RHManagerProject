package com.ibntofail.rhmanager.model;

import javax.persistence.*;

@Entity
@PrimaryKeyJoinColumn(name = "person_id")
public class Enseignant extends Personne {

    @Column
    private String matiere;

    @Column
    private String diplome;

    public String getMatiere() {
        return matiere;
    }

    public void setMatiere(String matiere) {
        this.matiere = matiere;
    }

    public String getDiplome() {
        return diplome;
    }

    public void setDiplome(String diplome) {
        this.diplome = diplome;
    }
}
