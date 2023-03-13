package com.example.gestiondeslivraison1.Mapper;


import com.example.gestiondeslivraison1.DTO.ProduitDTO;
import com.example.gestiondeslivraison1.Model.Produit;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public abstract class ProduitMapper {
    @Mapping(target="nom_Produit", expression= "java(produitDTO.getNomProduit())")
    @Mapping ( target="description_Produit" , expression = "java(produitDTO.getDescriptionProduit()")
    @Mapping ( target="prix_Produit" , expression = "java(produitDTO.getPrixProduit()")
    @Mapping(target="imageUrl_Produit" , expression = "java(produitDTO.getImageUrlProduit")


   public abstract Produit addProduit( ProduitDTO produitDTO );
    public Produit SetProduit ( Produit produit ,ProduitDTO produitDTO) {
        produit.setNom_Produit(produitDTO.getNom_ProduitDTO());
        return produit;
    }
}
