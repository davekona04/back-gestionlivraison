package com.example.gestiondeslivraison1.DTO;

public class LivreurDTO {
    private long id_livreurDTO;
    private String nom_livreurDTO;
    private String prenom_livreurDTO;
    private long nbre_livraisonDTO;
    private long tel_livreurDTO;


    public long getId_livreurDTO() {
        return id_livreurDTO;
    }

    public void setId_livreurDTO(long id_livreurDTO) {
        this.id_livreurDTO = id_livreurDTO;
    }

    public String getNom_livreurDTO() {
        return nom_livreurDTO;
    }

    public void setNom_livreurDTO(String nom_livreurDTO) {
        this.nom_livreurDTO = nom_livreurDTO;
    }

    public String getPrenom_livreurTO() {
        return prenom_livreurDTO;
    }

    public void setPrenom_livreurTO(String prenom_livreurTO) {
        this.prenom_livreurDTO = prenom_livreurTO;
    }

    public long getNbre_livraisonDTO() {
        return nbre_livraisonDTO;
    }

    public void setNbre_livraisonDTO(long nbre_livraisonDTO) {
        this.nbre_livraisonDTO = nbre_livraisonDTO;
    }

    public long getTel_livreurDTO() {
        return tel_livreurDTO;
    }

    public void setTel_livreurDTO(long tel_livreurDTO) {
        this.tel_livreurDTO = tel_livreurDTO;
    }
}
