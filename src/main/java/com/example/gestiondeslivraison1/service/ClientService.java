package com.example.gestiondeslivraison1.service;

import com.example.gestiondeslivraison1.Model.Client;
import com.example.gestiondeslivraison1.DTO.ClientDTO;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
public interface  ClientService {

    Client saveClient (ClientDTO clientDTO);
    Client updateClient (long  id_client , ClientDTO clientDTO);
    Client getClient ( long id);

    List<Client> getAllClient();
    void deleteClient(long id);
}

