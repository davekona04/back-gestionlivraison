package com.example.gestiondeslivraison1.Model;

public class commande {
    private int id_commande;
    private String date_commandel;
    private Float prix_total_commande;
    private String lieu_livraison;

    public int getId_commande() {
        return id_commande;
    }

    public void setId_commande(int id_commande) {
        this.id_commande = id_commande;
    }

    public String getDate_commandel() {
        return date_commandel;
    }

    public void setDate_commandel(String date_commandel) {
        this.date_commandel = date_commandel;
    }

    public Float getPrix_total_commande() {
        return prix_total_commande;
    }

    public void setPrix_total_commande(Float prix_total_commande) {
        this.prix_total_commande = prix_total_commande;
    }

    public String getLieu_livraison() {
        return lieu_livraison;
    }

    public void setLieu_livraison(String lieu_livraison) {
        this.lieu_livraison = lieu_livraison;
    }

    public commande(int id_commande, String date_commandel, Float ptrix_total_commande, String lieu_livraison) {
        this.id_commande = id_commande;
        this.date_commandel = date_commandel;
        this.prix_total_commande = prix_total_commande;
        this.lieu_livraison = lieu_livraison;



    }
}






