package com.example.gestiondeslivraison1.service_implementation;

import com.example.gestiondeslivraison1.DTO.AdminstrateurDTO;
import com.example.gestiondeslivraison1.Mapper.AdminstrateurMapper;
import com.example.gestiondeslivraison1.Model.Administrateur;
import com.example.gestiondeslivraison1.repository.AdminstrateurRepository;
import com.example.gestiondeslivraison1.service.AdministrateurService;

import java.util.List;

public class AdministrateurImplementation  implements AdministrateurService {

    private AdminstrateurRepository adminstrateurRepository;
    private AdminstrateurMapper adminstrateurMapper;


    @Override
    public Administrateur SaveAdministrateur(AdminstrateurDTO adminstrateurDTO) {
       Administrateur administrateur= adminstrateurMapper.addAdminstrateur(adminstrateurDTO);
       return  adminstrateurRepository.save(administrateur);
    }

    @Override
    public Administrateur UpdateAdministrateur(Long id, AdminstrateurDTO adminstrateurDTO) {
      Administrateur administrateur0= FindByIdAdministrateur(id);
       Administrateur administrateur = adminstrateurMapper.setAdminstrateur(administrateur0,adminstrateurDTO);

        return adminstrateurRepository.save(administrateur);
    }

    @Override
    public List<Administrateur> FindAllAdministrateur() {
       return adminstrateurRepository.findAll();

    }

    @Override
    public Administrateur FindByIdAdministrateur(long id){
        return adminstrateurRepository.findById_Administrateur(id);
    }
    @Override
    public Void deleteAdministrateur(long id) {
       this.adminstrateurRepository.deleteById(id);
       return null;
    }
}
