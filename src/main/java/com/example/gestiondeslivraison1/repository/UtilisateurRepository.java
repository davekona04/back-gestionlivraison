package com.example.gestiondeslivraison1.repository;

import com.example.gestiondeslivraison1.Model.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UtilisateurRepository extends JpaRepository<Utilisateur,Integer>{

Optional<Utilisateur> findByEmail_utilisateur(String email);



}
