package com.example.gestiondeslivraison1.DTO;

public class ProduitDTO {
    private String nom_ProduitDTO;
    private String description_ProduitDTO;
    private double prix_ProduiDTO;
    private  String imageUrl_ProduitDTO;

    @Override
    public String toString() {
        return "ProduitDTO{" +
                "nom_ProduitDTO='" + nom_ProduitDTO + '\'' +
                ", description_ProduitDTO='" + description_ProduitDTO + '\'' +
                ", prix_ProduiDTO=" + prix_ProduiDTO +
                ", imageUrl_ProduitDTO='" + imageUrl_ProduitDTO + '\'' +
                '}';
    }

    public String getNom_ProduitDTO() {
        return nom_ProduitDTO;
    }

    public void setNom_ProduitDTO(String nom_ProduitDTO) {
        this.nom_ProduitDTO = nom_ProduitDTO;
    }

    public String getDescription_ProduitDTO() {
        return description_ProduitDTO;
    }

    public void setDescription_ProduitDTO(String description_ProduitDTO) {
        this.description_ProduitDTO = description_ProduitDTO;
    }

    public double getPrix_ProduiDTO() {
        return prix_ProduiDTO;
    }

    public void setPrix_ProduiDTO(double prix_ProduiDTO) {
        this.prix_ProduiDTO = prix_ProduiDTO;
    }

    public String getImageUrl_ProduitDTO() {
        return imageUrl_ProduitDTO;
    }

    public void setImageUrl_ProduitDTO(String imageUrl_ProduitDTO) {
        this.imageUrl_ProduitDTO = imageUrl_ProduitDTO;
    }

    public ProduitDTO(String nom_ProduitDTO, String description_ProduitDTO, double prix_ProduiDTO, String imageUrl_ProduitDTO) {
        this.nom_ProduitDTO = nom_ProduitDTO;
        this.description_ProduitDTO = description_ProduitDTO;
        this.prix_ProduiDTO = prix_ProduiDTO;
        this.imageUrl_ProduitDTO = imageUrl_ProduitDTO;
    }
}
