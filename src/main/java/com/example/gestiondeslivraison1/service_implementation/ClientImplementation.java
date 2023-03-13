package com.example.gestiondeslivraison1.service_implementation;

import com.example.gestiondeslivraison1.Model.Client;
import com.example.gestiondeslivraison1.DTO.ClientDTO;
import com.example.gestiondeslivraison1.Mapper.ClientMapper;
import com.example.gestiondeslivraison1.repository.ClientRepository;
import com.example.gestiondeslivraison1.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ClientImplementation implements ClientService {

private final ClientRepository clientRepository;
private final ClientMapper clientMapper;

    public ClientImplementation(ClientRepository clientRepository, ClientMapper clientMapper) {
        this.clientRepository = clientRepository;
        this.clientMapper = clientMapper;
    }

    @Override
    public Client saveClient(ClientDTO clientDTO) {
         Client client = clientMapper.addClient(clientDTO);
        return  clientRepository.save(client);
    }

    @Override
    public Client updateClient(long id_client, ClientDTO clientDTO) {
        Client client0 = getClient(id_client);
        //le client 0 il s'agit du client qui  existe deja dans la BD
        Client client = clientMapper.SetClientt(client0 ,clientDTO);
        // ici  on modifie ses donnees a travers la methode set client

        return clientRepository.save(client);
    }


    @Override

    public Client getClient(long id_client) {

        return clientRepository.findById(id_client).orElse(null); }

    @Override
    public void deleteClient(long id) {
        this.clientRepository.deleteById_client(id);
    }

    @Override
    public List<Client> getAllClient() {

        return clientRepository.findAll();
    }
}
