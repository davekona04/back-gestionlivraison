package com.example.gestiondeslivraison1.repository;

import com.example.gestiondeslivraison1.Model.Administrateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminstrateurRepository extends JpaRepository<Administrateur,Long> {
    Administrateur findById_Administrateur(long id);
    Administrateur deleteById_Administrateur(long id );
}
