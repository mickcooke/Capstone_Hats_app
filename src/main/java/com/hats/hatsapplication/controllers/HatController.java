package com.hats.hatsapplication.controllers;

import com.hats.hatsapplication.models.Hat;
import com.hats.hatsapplication.repositories.HatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HatController {

    @Autowired
    HatRepository hatRepository;

    @GetMapping(value = "/hats")
    public ResponseEntity<List<Hat>> getAllHats(){
        return new ResponseEntity<>(hatRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/hats/{id}")
    public ResponseEntity getHat(@PathVariable Long id){
        return new ResponseEntity<>(hatRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/hats")
    public ResponseEntity postHat(@RequestBody Hat hat){
        hatRepository.save(hat);
        return new ResponseEntity<>(hat, HttpStatus.CREATED);
    }

    @DeleteMapping(value = "/hats/{id}")
    public ResponseEntity deleteHat(@PathVariable Long id) {
        hatRepository.deleteById(id);
        return new ResponseEntity(null, HttpStatus.OK);
    }

    @PutMapping(value = "/hats/{id}")
    public ResponseEntity updateHat(@RequestBody Hat updatedHat, @PathVariable Long id) {
        hatRepository.save(updatedHat);
        return new ResponseEntity(updatedHat, HttpStatus.OK);
    }



}
