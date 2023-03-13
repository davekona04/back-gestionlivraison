package com.example.gestiondeslivraison1.repository;

import com.example.gestiondeslivraison1.Model.Livreur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivreurRepository extends JpaRepository<Livreur , Long> {
  //  @Query("select nom from Livreur where nom="dave"" ) ;
Livreur deleteById_livreur(long id);
Livreur findById_livreur(long id);
}
