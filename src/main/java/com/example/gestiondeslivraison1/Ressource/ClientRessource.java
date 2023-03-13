package com.example.gestiondeslivraison1.Ressource;


import com.example.gestiondeslivraison1.DTO.ClientDTO;
import com.example.gestiondeslivraison1.Model.Client;
import com.example.gestiondeslivraison1.service.ClientService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientRessource {

    private final ClientService clientService;


    public ClientRessource(ClientService clientService) {
        this.clientService = clientService;
    }
    @GetMapping("/get/{id}")
    public ResponseEntity<Client> ObtenirIdClient(@PathVariable("id") long id) {
        Client client = clientService.getClient(id);
        return new ResponseEntity<Client>(client, HttpStatus.OK);
    }
    @PostMapping("/add")
    public ResponseEntity<Client> EnregistrerClient(@RequestBody ClientDTO clientDTO) {
        Client client = clientService.saveClient(clientDTO);
        return new ResponseEntity<Client>(client, HttpStatus.CREATED);

    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Client> ModifierClient(@PathVariable("id") long id, @RequestBody ClientDTO clientDTO) {
        Client client = clientService.updateClient(id, clientDTO);
        return new ResponseEntity<Client>(client, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public  ResponseEntity<Client>SupprimerClient(@PathVariable("id") long id){
         clientService.deleteClient(id);
        return new ResponseEntity<Client>(HttpStatus.OK);
    }
    @GetMapping("/all")
    public ResponseEntity<List<Client>>ObtenirAllClient(){
        List<Client> client = clientService.getAllClient();
        return new ResponseEntity<List<Client>>(client,HttpStatus.OK);
    }

    }
