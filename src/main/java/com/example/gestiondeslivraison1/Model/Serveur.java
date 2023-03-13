package com.example.gestiondeslivraison1.Model;




import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Serveur {

    @Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_Serveur ;
 private String nom_Serveur;
 private String email_Serveur;
 private String imageUrl_Serveur;
 private String code_Serveur ;
private String phone_Serveur;


    public String getPhone_Serveur() {
        return phone_Serveur;
    }

    public void setPhone_Serveur(String phone_Serveur) {
        this.phone_Serveur = phone_Serveur;
    }

    public String getImageUrl_Serveur() {
        return imageUrl_Serveur;
    }

    public void setImageUrl_Serveur(String imageUrl_Serveur) {
        this.imageUrl_Serveur = imageUrl_Serveur;
    }

    public Serveur(String phone_Serveur, String imageUrl_Serveur) {
        this.phone_Serveur = phone_Serveur;
        this.imageUrl_Serveur = imageUrl_Serveur;
    }

    public long getId() {
        return id_Serveur;
    }

    public void setId(long id) {
        this.id_Serveur = id;
    }

    public String getNomServeur() {
        return nom_Serveur;
    }

    public void setNomServeur(String nomServeur) {
        this.nom_Serveur = nomServeur;
    }

    public String getEmailServeur() {
        return email_Serveur;
    }

    public void setEmailServeur(String emailServeur) {
        this.email_Serveur = emailServeur;
    }

    public String getImageUrlServeur() {
        return imageUrl_Serveur;
    }

    public void setImageUrlServeur(String imageUrlServeur) {
        this.imageUrl_Serveur = imageUrlServeur;
    }

    public String getCodeServeur() {
        return code_Serveur;
    }

    public void setCodeServeur(String codeServeur) {
        this.code_Serveur = codeServeur;
    }

    @Override
    public String toString() {
        return "Serveur{" +
                "id=" + id_Serveur +
                ", nomServeur='" + nom_Serveur + '\'' +
                ", emailServeur='" + email_Serveur + '\'' +
                ", imageUrlServeur='" + imageUrl_Serveur + '\'' +
                ", codeServeur='" + code_Serveur + '\'' +
                '}';
    }

    public Serveur(long id, String nomServeur, String emailServeur, String imageUrlServeur, String codeServeur) {
        this.id_Serveur = id;
        this.nom_Serveur = nomServeur;
        this.email_Serveur = emailServeur;
        this.imageUrl_Serveur = imageUrlServeur;
        this.code_Serveur = codeServeur;


    }
}
