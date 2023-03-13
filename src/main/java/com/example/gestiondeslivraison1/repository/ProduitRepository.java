package com.example.gestiondeslivraison1.repository;

import com.example.gestiondeslivraison1.Model.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepository extends JpaRepository<Produit,Long> {
    Produit findById_Produit(long id);
    Produit deleteById_Produit(long id);
}
