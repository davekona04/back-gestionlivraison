package com.example.gestiondeslivraison1.service;

import com.example.gestiondeslivraison1.DTO.ProduitDTO;
import com.example.gestiondeslivraison1.Model.Produit;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProduitService {
      Produit saveProduit (ProduitDTO produitDTO);
      Produit updateProduit(long id ,ProduitDTO produitDTO);
      Produit getById(long id);
      List<Produit> getAll();
      void deleteById(long id);


}
