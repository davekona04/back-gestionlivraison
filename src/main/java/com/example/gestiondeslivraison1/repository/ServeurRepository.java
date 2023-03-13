package com.example.gestiondeslivraison1.repository;

import com.example.gestiondeslivraison1.Model.Serveur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServeurRepository extends JpaRepository<Serveur,Long> {

    Serveur findById_Serveur (long id );
    Serveur deleteById_Serveur(long id);
}
