package com.example.gestiondeslivraison1.service_implementation;

import com.example.gestiondeslivraison1.DTO.ServeurDTO;
import com.example.gestiondeslivraison1.Mapper.ServeurMapper;
import com.example.gestiondeslivraison1.Model.Serveur;
import com.example.gestiondeslivraison1.repository.ServeurRepository;
import com.example.gestiondeslivraison1.service.ServeurService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ServeurImplementation implements ServeurService {

    public ServeurRepository serveurRepository;
    public ServeurMapper serveurMapper;

    public ServeurImplementation(ServeurRepository serveurRepository) {
        this.serveurRepository = serveurRepository;
    }

    @Override
    public  Serveur saveServeur(ServeurDTO serveurDTO) {
Serveur serveur = serveurMapper.addServeur(serveurDTO);
 return serveurRepository.save(serveur);
    }

    @Override
    public Serveur UpdateServeur(long id, ServeurDTO serveurDTO) {

        Serveur serveur0 =getServeurId(id);
        Serveur serveur = serveurMapper.SetServeur(serveur0,serveurDTO);
        return serveurRepository.save(serveur);
    }

    @Override
    public Serveur getServeurId(long id) {

        return serveurRepository.findById_Serveur(id);
    }

    @Override
    public void deleteServeur(long id) {
        Serveur serveur = this.serveurRepository.deleteById_Serveur(id);}

    @Override
    public List<Serveur> getAllServeur() {
        return serveurRepository.findAll();
    }
}
