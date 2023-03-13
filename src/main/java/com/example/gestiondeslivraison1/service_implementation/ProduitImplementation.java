package com.example.gestiondeslivraison1.service_implementation;

import com.example.gestiondeslivraison1.DTO.ProduitDTO;
import com.example.gestiondeslivraison1.Mapper.ProduitMapper;
import com.example.gestiondeslivraison1.Model.Produit;
import com.example.gestiondeslivraison1.repository.ProduitRepository;
import com.example.gestiondeslivraison1.service.ProduitService;

import java.util.List;

public class ProduitImplementation  implements ProduitService {

    private final ProduitMapper produitMapper;
    private final ProduitRepository produitRepository;

    public ProduitImplementation(ProduitMapper produitMapper, ProduitRepository produitRepository) {
        this.produitMapper = produitMapper;
        this.produitRepository = produitRepository;
    }

    @Override
    public Produit saveProduit(ProduitDTO produitDTO) {
        Produit produit = produitMapper.addProduit(produitDTO);
        return produitRepository.save(produit);
    }

    @Override
    public Produit updateProduit(long id, ProduitDTO produitDTO) {
      Produit produit0 = getById(id);
        Produit produit = produitMapper.SetProduit(produit0,produitDTO);
        return produitRepository.save(produit);
    }

    @Override
    public Produit getById(long id) {
        return produitRepository.findById_Produit(id);
    }

    @Override
    public List<Produit> getAll() {
        return produitRepository.findAll();
    }

    @Override
    public void deleteById(long id) {
        this.deleteById(id);
    }
}
