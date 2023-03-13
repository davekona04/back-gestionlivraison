package com.example.gestiondeslivraison1.DTO;

import javax.persistence.Entity;

@Entity
public class AdminstrateurDTO {
    private String nom_AministrateurDTO;
    private String prenom_AdministrateurDTO;
    private  String email_AdministrateurDTO;

    @Override
    public String toString() {
        return "AdminstrateurDTO{" +
                "nom_AministrateurDTO='" + nom_AministrateurDTO + '\'' +
                ", prenom_AdministrateurDTO='" + prenom_AdministrateurDTO + '\'' +
                ", email_AdministrateurDTO='" + email_AdministrateurDTO + '\'' +
                '}';
    }

    public String getNom_AministrateurDTO() {
        return nom_AministrateurDTO;
    }

    public void setNom_AministrateurDTO(String nom_AministrateurDTO) {
        this.nom_AministrateurDTO = nom_AministrateurDTO;
    }

    public String getPrenom_AdministrateurDTO() {
        return prenom_AdministrateurDTO;
    }

    public void setPrenom_AdministrateurDTO(String prenom_AdministrateurDTO) {
        this.prenom_AdministrateurDTO = prenom_AdministrateurDTO;
    }

    public String getEmail_AdministrateurDTO() {
        return email_AdministrateurDTO;
    }

    public void setEmail_AdministrateurDTO(String email_AdministrateurDTO) {
        this.email_AdministrateurDTO = email_AdministrateurDTO;
    }

    public AdminstrateurDTO(String nom_AministrateurDTO, String prenom_AdministrateurDTO, String email_AdministrateurDTO) {
        this.nom_AministrateurDTO = nom_AministrateurDTO;
        this.prenom_AdministrateurDTO = prenom_AdministrateurDTO;
        this.email_AdministrateurDTO = email_AdministrateurDTO;
    }
}
