package com.ibntofail.rhmanager.model;


import javax.persistence.*;

@Entity
public class Presidence {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String nomPres;

    @Column
    private String emailPres;

    @Column
    private static int nbEffectif;


    public String getNomPres(){
        return nomPres;
    }


    public long getId() {
        return id;
    }

    public String getEmailPres(){
        return emailPres;
    }

    public static int getNbEffectif(){
        return nbEffectif;
    }

    public void setNomPres(String nomPres){
        this.nomPres=nomPres;
    }

    public void setEmailPres(String emailPres){
        this.emailPres=emailPres;
    }

    public static void setNbEffectif(){
        nbEffectif++;
    }

    public void setId(long id) {
        this.id = id;
    }
}

