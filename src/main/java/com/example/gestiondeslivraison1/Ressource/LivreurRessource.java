package com.example.gestiondeslivraison1.Ressource;

import com.example.gestiondeslivraison1.DTO.LivreurDTO;
import com.example.gestiondeslivraison1.Model.Livreur;
import com.example.gestiondeslivraison1.service.LivreurService;
import com.example.gestiondeslivraison1.service_implementation.LivreurImplementation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/livreur")
public class LivreurRessource {
    private final LivreurService livreurService;

    public LivreurRessource(LivreurService livreurService) {
        this.livreurService = livreurService;}
  @GetMapping("/all")
    public ResponseEntity<List<Livreur>> ObtenirLivreur(){
        List<Livreur>  livreur = livreurService.getallLivreur();
        return new  ResponseEntity<List<Livreur>>(livreur,HttpStatus.OK);

}
@GetMapping("/find/{id}")
    public  ResponseEntity<Livreur>  ObtenirLivreurParID( @PathVariable("id")long id){
        Livreur livreur = livreurService.getbyid(id);
        return  new ResponseEntity<Livreur>(livreur,HttpStatus.OK);
}
@PostMapping("/add")
    public ResponseEntity<Livreur> EnregistrerLivreur (@RequestBody  LivreurDTO livreurDTO){
        Livreur livreur = livreurService.saveLivreur(livreurDTO);
        return  new ResponseEntity<Livreur> (livreur,HttpStatus.CREATED);
}

@PutMapping("/update")
    public ResponseEntity<Livreur> ModifierLivreur  ( @RequestBody long id , LivreurDTO livreurDTO){
        Livreur livreur=livreurService.updateLivreur(id,livreurDTO);
        return new ResponseEntity<Livreur>(livreur,HttpStatus.OK);
}
@DeleteMapping("/delete/{id}")
    public ResponseEntity<Livreur>  SupprimerLivreur (@PathVariable("id") long id){
    livreurService.deleteLivreur(id);
        return  new ResponseEntity<Livreur>(HttpStatus.OK);
}


}


