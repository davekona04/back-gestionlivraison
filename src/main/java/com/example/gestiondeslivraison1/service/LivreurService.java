package com.example.gestiondeslivraison1.service;

import com.example.gestiondeslivraison1.Model.Livreur;
import com.example.gestiondeslivraison1.DTO.LivreurDTO;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface LivreurService {
    Livreur saveLivreur(LivreurDTO livreurDTO);
    Livreur updateLivreur( long id , LivreurDTO livreurDTO);
    Livreur getbyid ( long id );
    List<Livreur> getallLivreur();
    void deleteLivreur (long id);
}
