package com.example.gestiondeslivraison1.Ressource;

import com.example.gestiondeslivraison1.DTO.AdminstrateurDTO;
import com.example.gestiondeslivraison1.Model.Administrateur;
import com.example.gestiondeslivraison1.service.AdministrateurService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/administrateur")

public class AdministrateurRessource {
    private AdministrateurService administrateurService;

    @PostMapping("/add")
    public ResponseEntity<Administrateur> EnregistrerAdministrateur (@RequestBody AdminstrateurDTO adminstrateurDTO){
        Administrateur administrateur = administrateurService.SaveAdministrateur(adminstrateurDTO);
        return  new ResponseEntity<Administrateur>(administrateur, HttpStatus.CREATED);
    }
@PutMapping("/update/{id}")
    public ResponseEntity<Administrateur> ModifierAdministrateur (@PathVariable("id") long id , @RequestBody AdminstrateurDTO adminstrateurDTO){
        Administrateur administrateur = administrateurService.UpdateAdministrateur(id,adminstrateurDTO);
        return  new ResponseEntity<Administrateur>(administrateur, HttpStatus.OK);
    }
@GetMapping("/all")
    public ResponseEntity<List<Administrateur>> ObtenirAllAdministrateur (){
        List<Administrateur> administrateur = administrateurService.FindAllAdministrateur();
        return  new ResponseEntity<List<Administrateur>>(administrateur, HttpStatus.OK);
    }
    @GetMapping("/get/{id}")
    public ResponseEntity<Administrateur> ObtenirIdAdministrateur (@PathVariable("id") long id){
        Administrateur administrateur = administrateurService.FindByIdAdministrateur(id);
        return  new ResponseEntity<Administrateur>(administrateur, HttpStatus.OK);
    }
    @DeleteMapping("/delete")
      public ResponseEntity<Administrateur> EnregistrerAdministrateur (@PathVariable("id") long id){
        administrateurService.deleteAdministrateur(id);
        return new ResponseEntity<Administrateur>(HttpStatus.OK);
    }
























}
