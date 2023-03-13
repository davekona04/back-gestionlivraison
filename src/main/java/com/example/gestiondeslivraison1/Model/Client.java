package com.example.gestiondeslivraison1.Model;

import javax.persistence.Entity;

@Entity
public class Client {

   private long id_client;
    private String nom ;
    private String prenom ;
    private String localisation ;
    private long tel_client;
    private String sexe_client;

    public Client() {
    }

    public Client(long id_client, String nom, String prenom, String localisation, int tel_client,String sexe_client) {
        this.id_client = id_client;
        this.nom = nom;
        this.prenom = prenom;
        this.localisation = localisation;
        this.tel_client = tel_client;
        this.sexe_client =sexe_client;
    }

    public Client(String nom, String prenom, String localisation, int tel_client,String sexe_client) {
        this.nom = nom;
        this.prenom = prenom;
        this.localisation = localisation;
        this.tel_client = tel_client;
        this.sexe_client = sexe_client;
    }

    public long getId_client() {
        return id_client;
    }

    public void setId_client(long id_client) {
        this.id_client = id_client;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getLocalisation() {
        return localisation;
    }

    public void setLocalisation(String localisation) {
        this.localisation = localisation;
    }

    public long getTel_client() {
        return tel_client;
    }

    public void setTel_client(long tel_client) {
        this.tel_client = tel_client;
    }


    public String getSexe_client() {
        return sexe_client;
    }

    public void setSexe_client_client(long tel_client) {
        this.sexe_client = sexe_client;
    }



}


