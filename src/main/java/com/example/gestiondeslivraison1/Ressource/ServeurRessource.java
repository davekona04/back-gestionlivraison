package com.example.gestiondeslivraison1.Ressource;

import com.example.gestiondeslivraison1.DTO.ServeurDTO;
import com.example.gestiondeslivraison1.Model.Serveur;
import com.example.gestiondeslivraison1.service.ServeurService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Serveur")

public class ServeurRessource {

    private final  ServeurService serveurService;


    public ServeurRessource(ServeurService serveurService ) {
        this.serveurService = serveurService;
    }
@GetMapping("/all")
    public ResponseEntity<List<Serveur>>  ObtenirAllServeur(){
      List<Serveur> serveurs = serveurService.getAllServeur();
     return new ResponseEntity<List<Serveur>>(serveurs,HttpStatus.OK);}

      @PostMapping("/add")
     public ResponseEntity<Serveur> EnregistrerServeur(@RequestBody ServeurDTO serveurDTO){
Serveur serveur = serveurService.saveServeur(serveurDTO);
    return  new ResponseEntity<Serveur>( serveur,HttpStatus.CREATED);

        }

        @PutMapping("/update/{id}")
          public ResponseEntity<Serveur> ModifierServeur ( @PathVariable("id") long  id, @RequestBody ServeurDTO serveurDTO ){

        Serveur serveur =  serveurService.UpdateServeur(id,serveurDTO);
        return new ResponseEntity<Serveur>(serveur, HttpStatus.OK);


        }


        @DeleteMapping("/delete/{id}")
    public ResponseEntity<Serveur>SupprimerServeur ( @PathVariable("id") long id  ){

         serveurService.deleteServeur(id);
        return new  ResponseEntity<Serveur>(HttpStatus.OK);


        }

        @GetMapping("/get/{id}")
    public ResponseEntity<Serveur> ObtenirServeurId(@PathVariable("id") long id ){

        Serveur serveur = serveurService.getServeurId(id);
        return new  ResponseEntity<Serveur>(serveur,HttpStatus.OK);
    }
  }







