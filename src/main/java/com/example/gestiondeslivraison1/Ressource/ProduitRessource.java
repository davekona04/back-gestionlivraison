package com.example.gestiondeslivraison1.Ressource;


import com.example.gestiondeslivraison1.DTO.ProduitDTO;
import com.example.gestiondeslivraison1.Model.Produit;
import com.example.gestiondeslivraison1.service.ProduitService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/produit")
@RestController
public class ProduitRessource {
    private final ProduitService produitService;

    public ProduitRessource(ProduitService produitService) {
        this.produitService = produitService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Produit>>ObtenirAllProduit (){
        List<Produit> produit = produitService.getAll();
        return new ResponseEntity<List<Produit>>(produit, HttpStatus.OK);
    }
    @GetMapping("/get/{id}")
    public ResponseEntity<Produit>ObtenirIdProduit(@PathVariable("id") long id){
        Produit produit = produitService.getById(id);
        return new ResponseEntity<Produit>(produit,HttpStatus.OK);
    }
    @PostMapping("/add")
    public ResponseEntity<Produit>EnregistrerProduit(@RequestBody ProduitDTO produitDTO){
        Produit produit=produitService.saveProduit(produitDTO);
        return new ResponseEntity<Produit>(produit,HttpStatus.CREATED);}

       @PutMapping("/update/{id}")
               public  ResponseEntity<Produit>ModifierProduit(@PathVariable("id") long id , @RequestBody ProduitDTO produitDTO){
             Produit produit = produitService.updateProduit(id,produitDTO);
             return new ResponseEntity<Produit>(produit,HttpStatus.OK);}

@DeleteMapping("/delete/{id}")
public  ResponseEntity<Produit>SupprimerProduit(@PathVariable("id") long id){
    produitService.deleteById(id);
    return new ResponseEntity<Produit>(HttpStatus.OK);}







}


