package com.example.gestiondeslivraison1.DTO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

public class UtilsateurDTO {



    @Entity
    public class Utilisateur {


        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id_utilisateurDTO;
        private String nom_utilisateurDTO;
        private String prenom_utilisateurDTO;
        private long tel_utilisateurDTO;
        private String sexe_utilisateurDTO;
        private String photo_utilisateurDTO;
        private String rolesDTO;

        public String getRolesDTO() {
            return rolesDTO;
        }

        public void setRolesDTO(String rolesDTO) {
            this.rolesDTO = rolesDTO;
        }

        public String getEmail_utilisateurDTO() {
            return Email_utilisateurDTO;
        }

        public void setEmail_utilisateurDTO(String email_utilisateurDTO) {
            Email_utilisateurDTO = email_utilisateurDTO;
        }

        private  String Email_utilisateurDTO;

        public Utilisateur(String email_utilisateurDTO) {
            Email_utilisateurDTO = email_utilisateurDTO;
        }

        public String getPhoto_utilisateurDTO() {
            return photo_utilisateurDTO;
        }

        public void setPhoto_utilisateurDTO(String photo_utilisateurDTO) {
            this.photo_utilisateurDTO = photo_utilisateurDTO;
        }

        public long getId_utilisateurDTO() {
            return id_utilisateurDTO;
        }

        public void setId_utilisateurDTO(long id_utilisateurDTO) {
            this.id_utilisateurDTO = id_utilisateurDTO;
        }

        public String getNom_utilisateurDTO() {
            return nom_utilisateurDTO;
        }

        public void setNom_utilisateurDTO(String nom_utilisateurDTO) {
            this.nom_utilisateurDTO = nom_utilisateurDTO;
        }

        public String getPrenom_utilisateurDTO() {
            return prenom_utilisateurDTO;
        }

        public void setPrenom_utilisateurDTO(String prenom_utilisateurDTO) {
            this.prenom_utilisateurDTO = prenom_utilisateurDTO;
        }

        public long getTel_utilisateurDTO() {
            return tel_utilisateurDTO;
        }

        public void setTel_utilisateurDTO(long tel_utilisateurDTO) {
            this.tel_utilisateurDTO = tel_utilisateurDTO;
        }

        public String getSexe_utilisateurDTO() {
            return sexe_utilisateurDTO;
        }

        public void setSexe_utilisateurDTO(String sexe_utilisateurDTO) {
            this.sexe_utilisateurDTO = sexe_utilisateurDTO;
        }
    }}