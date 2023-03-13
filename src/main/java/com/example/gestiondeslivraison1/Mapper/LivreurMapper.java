package com.example.gestiondeslivraison1.Mapper;

import com.example.gestiondeslivraison1.Model.Livreur;
import com.example.gestiondeslivraison1.DTO.LivreurDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper (componentModel ="Spring")

public  abstract class LivreurMapper {
    @Mapping(target = "nom_livreur", expression = "java(livreurDTO.getNom_livreur())")
    @Mapping(target = "prenom_livreur", expression = "java(livreurDTO.getPrenom_livreur())")
    @Mapping(target = "nbre_livraison", expression = "java(LivreurDTO.getNbre_livraison())")
    @Mapping(target = "tel_livreur", expression = "java(Livreur.getTel_livreur())")
    public abstract Livreur AddLivreur(LivreurDTO livreurDTO);



    public Livreur SetLivreur(LivreurDTO livreurDTO, Livreur livreur) {
        livreur.setNom_livreur(livreurDTO.getNom_livreurDTO());
       return livreur;
    }
    }