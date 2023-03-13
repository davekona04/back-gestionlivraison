package com.example.gestiondeslivraison1.repository;

import com.example.gestiondeslivraison1.Model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public  interface  ClientRepository extends JpaRepository< Client , Long> {

  //  @Query("Delete nom from Client where nom=dave")
    Client deleteById_client(long id);



}