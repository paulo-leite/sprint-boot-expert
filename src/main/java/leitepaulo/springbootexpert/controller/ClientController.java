package leitepaulo.springbootexpert.controller;

import leitepaulo.springbootexpert.dto.ClientDto;
import leitepaulo.springbootexpert.model.Client;
import leitepaulo.springbootexpert.service.ClientService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/clients")
public class ClientController {

    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @Autowired
    private ModelMapper modelMapper;

    @PostMapping
    public ResponseEntity<ClientDto> insert(@RequestBody ClientDto clientDto) {
        Client obj = clientService.insert(modelMapper.map(clientDto, Client.class));
        return new ResponseEntity<>(modelMapper.map(obj, ClientDto.class), HttpStatus.CREATED);
    }
}
