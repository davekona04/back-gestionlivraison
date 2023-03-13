package com.example.gestiondeslivraison1.Model;

public class Administrateur {

    private long  id_Administrateur;
    private String nom_Administateur;
    private String  prenom_Adminstrateur;
    private  String email_Administrateur;

    public String getPrenom() {
        return prenom_Adminstrateur;
    }

    public void setPrenom(String prenom) {
        this.prenom_Adminstrateur = prenom;
    }

    public Administrateur(String prenom) {
        this.prenom_Adminstrateur = prenom;
    }



    public long getId() {
        return id_Administrateur ;
    }

    public void setId(long id) {
        this.id_Administrateur = id;
    }

    public String getNom_Administateur() {
        return nom_Administateur;
    }

    public void setNom_Administateur(String nom_Administateur) {
        this.nom_Administateur = nom_Administateur;
    }

    public String getEmail_Administrateur() {
        return email_Administrateur;
    }

    public void setEmail_Administrateur(String email_Administrateur) {
        this.email_Administrateur = email_Administrateur;
    }

    @Override
    public String toString() {
        return "Administrateur{" +
                "id_Administrateur=" + id_Administrateur +
                ", nom_Administateur='" + nom_Administateur + '\'' +
                ", prenom_Adminstrateur='" + prenom_Adminstrateur + '\'' +
                ", email_Administrateur='" + email_Administrateur + '\'' +
                '}';
    }

    public Administrateur(long id, String nom_Administateur, String email_Administrateur) {
        this.id_Administrateur = id;
        this.nom_Administateur = nom_Administateur;
        this.email_Administrateur = email_Administrateur;
    }
}
