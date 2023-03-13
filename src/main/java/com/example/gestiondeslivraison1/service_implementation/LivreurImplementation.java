package com.example.gestiondeslivraison1.service_implementation;

import com.example.gestiondeslivraison1.Model.Livreur;
import com.example.gestiondeslivraison1.DTO.LivreurDTO;
import com.example.gestiondeslivraison1.Mapper.LivreurMapper;
import com.example.gestiondeslivraison1.repository.LivreurRepository;
import com.example.gestiondeslivraison1.service.LivreurService;
import org.springframework.stereotype.Service;

import java.util.List;

public class LivreurImplementation implements  LivreurService {


    private final LivreurRepository livreurRepository;
    private  final LivreurMapper livreurMapper;


    public LivreurImplementation(LivreurRepository livreurRepository, LivreurMapper livreurMapper) {
        this.livreurRepository = livreurRepository;
        this.livreurMapper = livreurMapper;
    }

    @Override

    public Livreur saveLivreur(LivreurDTO livreurDTO) {
        Livreur livreur = livreurMapper.AddLivreur( livreurDTO);
         return livreurRepository.save(livreur);
    }

    @Override
    public Livreur updateLivreur(long id, LivreurDTO livreurDTO) {

        Livreur livreur0 = getbyid(id) ;
       Livreur livreur = livreurMapper.SetLivreur(livreurDTO, livreur0);

       return livreurRepository.save(livreur);
    }



    @Override
    public Livreur getbyid(long id) {
        return livreurRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteLivreur(long id) {
        this.livreurRepository.deleteById_livreur(id);
    }

    @Override
    public List<Livreur> getallLivreur() {
        return livreurRepository.findAll();
    }
}
