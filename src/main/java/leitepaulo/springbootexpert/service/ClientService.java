package leitepaulo.springbootexpert.service;

import leitepaulo.springbootexpert.model.Client;
import leitepaulo.springbootexpert.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

    private final ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }


    public Client insert(Client client){
        return clientRepository.save(client);
    }
}
