package com.example.gestiondeslivraison1.service;

import com.example.gestiondeslivraison1.DTO.AdminstrateurDTO;
import com.example.gestiondeslivraison1.Model.Administrateur;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AdministrateurService {

    Administrateur SaveAdministrateur(AdminstrateurDTO adminstrateurDTO);
    Administrateur UpdateAdministrateur (Long id ,AdminstrateurDTO adminstrateurDTO);
   List<Administrateur> FindAllAdministrateur ( );
    Administrateur  FindByIdAdministrateur(long id);
    Void deleteAdministrateur(long id);
}
