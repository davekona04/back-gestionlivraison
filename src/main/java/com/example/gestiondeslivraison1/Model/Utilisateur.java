package com.example.gestiondeslivraison1.Model;

        import javax.persistence.*;
        import java.util.List;

@Entity
public class Utilisateur {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="id_utilisateur")
    private long id_utilisateur;

    @Column(name="nom_utilisateur")
    private String nom_utilisateur;

    @Column(name="prenom_utilisateur")
    private String prenom_utilisateur;

    @Column(name="tel_utilisateur")
    private long tel_utilisateur;

    @Column(name="sexe_utilisateur")
    private String sexe_utilisateur;

    @Column(name="photo_utilisateur")
    private String photo_utilisateur;

    @Column(name="email_utilisateur")
    private  String Email_utilisateur;


    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    @OneToMany(mappedBy = "utilisateur")
    private  String roles;

    public String getPassword_utilisateur() {
        return password_utilisateur;
    }

    public void setPassword_utilisateur(String password_utilisateur) {
        this.password_utilisateur = password_utilisateur;
    }

    private  String password_utilisateur;

    public String getEmail_utilisateur() {
        return Email_utilisateur;
    }

    public void setEmail_utilisateur(String email_utilisateur) {
        Email_utilisateur = email_utilisateur;
    }

    public Utilisateur(String email_utilisateur) {
        Email_utilisateur = email_utilisateur;

    }

    public Utilisateur(String nom_utilisateur, String prenom_utilisateur, long tel_utilisateur, String sexe_utilisateur, String photo_utilisateur, String roles) {
        this.nom_utilisateur = nom_utilisateur;
        this.prenom_utilisateur = prenom_utilisateur;
        this.tel_utilisateur = tel_utilisateur;
        this.sexe_utilisateur = sexe_utilisateur;
        this.photo_utilisateur = photo_utilisateur;

    }

    public String getPhoto_utilisateur() {
        return photo_utilisateur;
    }

    public void setPhoto_utilisateur(String photo_utilisateur) {
        this.photo_utilisateur = photo_utilisateur;
    }

    public long getId_utilisateur() {
        return id_utilisateur;
    }

    public void setId_utilisateur(long id_utilisateur) {
        this.id_utilisateur = id_utilisateur;
    }

    public String getNom() {
        return nom_utilisateur;
    }

    public String getNom_utilisateur() {
        return nom_utilisateur;
    }

    public void setNom_utilisateur(String nom_utilisateur) {
        this.nom_utilisateur = nom_utilisateur;
    }

    public String getPrenom_utilisateur() {
        return prenom_utilisateur;
    }

    public void setPrenom_utilisateur(String prenom_utilisateur) {
        this.prenom_utilisateur = prenom_utilisateur;
    }

    public long getTel_utilisateur() {
        return tel_utilisateur;
    }

    public void setTel_utilisateur(long tel_utilisateur) {
        this.tel_utilisateur = tel_utilisateur;
    }

    public String getSexe_utilisateur() {
        return sexe_utilisateur;
    }

    public void setSexe_utilisateur(String sexe_utilisateur) {
        this.sexe_utilisateur = sexe_utilisateur;
    }
}