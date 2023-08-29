package com.hats.hatsapplication.controllers;

import com.hats.hatsapplication.models.Client;
import com.hats.hatsapplication.models.Hat;
import com.hats.hatsapplication.repositories.ClientRepository;
import com.hats.hatsapplication.repositories.HatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClientController {

    @Autowired
    ClientRepository clientRepository;

    @GetMapping(value = "/clients")
    public ResponseEntity<List<Client>> getAllClients(){
        return new ResponseEntity<>(clientRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/clients/{id}")
    public ResponseEntity getClient(@PathVariable Long id){
        return new ResponseEntity<>(clientRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/clients")
    public ResponseEntity postClient(@RequestBody Client client){
        clientRepository.save(client);
        return new ResponseEntity<>(client, HttpStatus.CREATED);
    }

    @DeleteMapping(value = "/clients/{id}")
    public ResponseEntity deleteClient(@PathVariable Long id) {
        clientRepository.deleteById(id);
        return new ResponseEntity(null, HttpStatus.OK);
    }

    @PutMapping(value = "/clients/{id}")
    public ResponseEntity updateClient(@RequestBody Client updatedClient, @PathVariable Long id) {
        clientRepository.save(updatedClient);
        return new ResponseEntity(updatedClient, HttpStatus.OK);
    }



}
