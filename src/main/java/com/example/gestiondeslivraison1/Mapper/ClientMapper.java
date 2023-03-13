package com.example.gestiondeslivraison1.Mapper;


import com.example.gestiondeslivraison1.Model.Client;
import com.example.gestiondeslivraison1.DTO.ClientDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel ="Spring")

public abstract  class ClientMapper {

 @Mapping(target = "nom"  ,  expression = "java(clientDTO.getNom())")
 @Mapping(target = "prenom"  ,  expression = "java(clientDTO.getPrenom())")
 @Mapping(target = "localisation"  ,  expression = "java(clientDTO.getLocalisation())")
 @Mapping(target = "tel_client"  ,  expression = "java(clientDTO.getTel_client())")

    public  abstract Client addClient ( ClientDTO ClientDTO);






    public Client SetClientt( Client client , ClientDTO clientDTO){

        client.setNom(clientDTO.getNomDTO());

        return client;
    }



}