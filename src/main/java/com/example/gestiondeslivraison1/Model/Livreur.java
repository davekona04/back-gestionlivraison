package com.example.gestiondeslivraison1.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Livreur {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_livreur;
    private String nom_livreur;
    private String prenom_livreur;
    private long  nbre_livraison;
    private long tel_livreur;

    public Livreur() {
    }

    public Livreur(long id_livreur, String nom_livreur, String prennom_livreur, long nbre_livraison, long tel_livreur) {
        this.id_livreur = id_livreur;
        this.nom_livreur = nom_livreur;
        this.prenom_livreur = prennom_livreur;
        this.nbre_livraison = nbre_livraison;
        this.tel_livreur = tel_livreur;
    }

    public Livreur(String nom_livreur, String prenom_livreur, long nbre_livraison, long tel_livreur) {
        this.nom_livreur = nom_livreur;
        this.prenom_livreur = prenom_livreur;
        this.nbre_livraison = nbre_livraison;
        this.tel_livreur = tel_livreur;
    }

    public long getId_livreur() {
        return id_livreur;
    }

    public void setId_livreur(long id_livreur) {
        this.id_livreur = id_livreur;
    }

    public String getNom_livreur() {
        return nom_livreur;
    }

    public void setNom_livreur(String nom_livreur) {
        this.nom_livreur = nom_livreur;
    }

    public String getPrennom_livreur() {
        return prenom_livreur;
    }

    public void setPrennom_livreur(String prennom_livreur) {
        this.prenom_livreur = prenom_livreur;
    }

    public long getNbre_livraison() {
        return nbre_livraison;
    }

    public void setNbre_livraison(long nbre_livraison) {
        this.nbre_livraison = nbre_livraison;
    }

    public long getTel_livreur() {
        return tel_livreur;
    }

    public void setTel_livreur(long tel_livreur) {
        this.tel_livreur = tel_livreur;
    }
}
