package com.example.gestiondeslivraison1.Mapper;


import com.example.gestiondeslivraison1.DTO.ServeurDTO;
import com.example.gestiondeslivraison1.Model.Serveur;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


@Mapper(componentModel = "Spring")


public abstract class ServeurMapper {
@Mapping(target="nom_Serveur" ,  expression="java(serveurDTO.getNomServeur())")
@Mapping ( target="phone_Serveur" , expression = "java(serveurDTO.getPhoneServeur()")
@Mapping(target="email_Serveur" ,  expression="java(serveurDTO.getEmailServeur())")
@Mapping ( target="imageUrl_Serveur" , expression = "java(serveurDTO.getImageUrlServeur()")


    public  abstract Serveur addServeur (ServeurDTO serveurDTO);

    public Serveur SetServeur (Serveur serveur , ServeurDTO serveurDTO){
        serveur.setNomServeur( serveurDTO.getNomDTo());
        return serveur;
}

}
