package com.ibntofail.rhmanager.model;

import javax.persistence.*;

@Entity
@Table(name="PERSONNE_ADMINISTRATIF")
@PrimaryKeyJoinColumn(name = "person_id")
public class PersonneAdministratif extends Personne {

    private String abilite;

    public String GetAbilite() {
        return abilite;
    }

    public void SetAbilite(String abilite) {
        this.abilite = abilite;
    }
}
