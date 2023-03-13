package com.example.gestiondeslivraison1.Mapper;

import com.example.gestiondeslivraison1.DTO.AdminstrateurDTO;
import com.example.gestiondeslivraison1.Model.Administrateur;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "Spring")
public  abstract class  AdminstrateurMapper {

     @Mapping(target = "nom_Adminstrateur", expression = "java(administrateurDTO.getNom_Administrateur())")
     @Mapping(target = "prenom_Adminstrateur", expression = "java(administrateurDTO.getPrenom_Administrateur())")
     @Mapping(target = "email_Adminstrateur", expression = "java(administrateurDTO.getEmail_Administrateur())")


     public abstract Administrateur addAdminstrateur(AdminstrateurDTO adminstrateurDTO);

     public Administrateur setAdminstrateur (Administrateur administrateur ,AdminstrateurDTO adminstrateurDTO){
         administrateur.setNom_Administateur(adminstrateurDTO.getNom_AministrateurDTO());
         return  administrateur;
     }
}
