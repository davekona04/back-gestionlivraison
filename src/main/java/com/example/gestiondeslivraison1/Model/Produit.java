package com.example.gestiondeslivraison1.Model;


import javax.persistence.Entity;

@Entity
public class Produit {
    private long id_Produit;
    private String nom_Produit;
    private String description;
    private double  prix_produit;
    private String code_produit;
private String imageUrl_Produit;
private String Statut ;

    @Override
    public String toString() {
        return "Produit{" +
                "id_Produit=" + id_Produit +
                ", nom_Produit='" + nom_Produit + '\'' +
                ", description='" + description + '\'' +
                ", prix_produit=" + prix_produit +
                ", code_produit='" + code_produit + '\'' +
                ", imageUrl_Produit='" + imageUrl_Produit + '\'' +
                '}';
    }

    public String getImageUrl_Produit() {
        return imageUrl_Produit;
    }

    public void setImageUrl_Produit(String imageUrl_Produit) {
        this.imageUrl_Produit = imageUrl_Produit;
    }

    public Produit(String imageUrl_Produit) {
        this.imageUrl_Produit = imageUrl_Produit;
    }

    public long getId_Produit() {
        return id_Produit;
    }

    public void setId_Produit(long id_Produit) {
        this.id_Produit = id_Produit;
    }

    public String getNom_Produit() {
        return nom_Produit;
    }

    public void setNom_Produit(String nom_Produit) {
        this.nom_Produit = nom_Produit;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrix_produit() {
        return prix_produit;
    }

    public void setPrix_produit(double prix_produit) {
        this.prix_produit = prix_produit;
    }

    public String getCode_produit() {
        return code_produit;
    }

    public void setCode_produit(String code_produit) {
        this.code_produit = code_produit;
    }

    public Produit(long id_Produit, String nom_Produit, String description, double prix_produit, String code_produit) {
        this.id_Produit = id_Produit;
        this.nom_Produit = nom_Produit;
        this.description = description;
        this.prix_produit = prix_produit;
        this.code_produit = code_produit;
    }
}
