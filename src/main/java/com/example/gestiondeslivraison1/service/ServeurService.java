package com.example.gestiondeslivraison1.service;

import com.example.gestiondeslivraison1.DTO.ServeurDTO;
import com.example.gestiondeslivraison1.Model.Serveur;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface ServeurService {
    public Serveur saveServeur (ServeurDTO serveurDTO);
    public Serveur UpdateServeur ( long id,ServeurDTO serveurDTO);
    public Serveur getServeurId ( long id);
    public void deleteServeur (long id );
    List<Serveur> getAllServeur( );







}
