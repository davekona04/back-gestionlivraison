package com.example.gestiondeslivraison1.DTO;

public class ServeurDTO {
    private long id_ServeurDTO;
    private String nomDTo;
    private String emailServeur;
    private String phoneDTO;
    private  String codeServeur ;
    //C'est code aleatoire lie a chaque Serveur


    public long getId_ServeurDTO() {
        return id_ServeurDTO;
    }

    public void setId_ServeurDTO(long id_ServeurDTO) {
        this.id_ServeurDTO = id_ServeurDTO;
    }

    public String getNomDTo() {
        return nomDTo;
    }

    public void setNomDTo(String nomDTo) {
        this.nomDTo = nomDTo;
    }

    public String getEmailServeur() {
        return emailServeur;
    }

    public void setEmailServeur(String emailServeur) {
        this.emailServeur = emailServeur;
    }

    public String getPhoneDTO() {
        return phoneDTO;
    }

    public void setPhoneDTO(String phoneDTO) {
        this.phoneDTO = phoneDTO;
    }

    public String getCodeServeur() {
        return codeServeur;
    }

    public void setCodeServeur(String codeServeur) {
        this.codeServeur = codeServeur;
    }

    @Override
    public String toString() {
        return "ServeurDTO{" +
                "id_ServeurDTO=" + id_ServeurDTO +
                ", nomDTo='" + nomDTo + '\'' +
                ", emailServeur='" + emailServeur + '\'' +
                ", phoneDTO='" + phoneDTO + '\'' +
                ", codeServeur='" + codeServeur + '\'' +
                '}';
    }

    public ServeurDTO(long id_ServeurDTO, String nomDTo, String emailServeur, String phoneDTO, String codeServeur) {
        this.id_ServeurDTO = id_ServeurDTO;
        this.nomDTo = nomDTo;
        this.emailServeur = emailServeur;
        this.phoneDTO = phoneDTO;
        this.codeServeur = codeServeur;




    }
}
