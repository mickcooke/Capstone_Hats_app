package com.hats.hatsapplication.controllers;

import com.hats.hatsapplication.models.Client;
import com.hats.hatsapplication.models.Job;
import com.hats.hatsapplication.repositories.ClientRepository;
import com.hats.hatsapplication.repositories.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JobController {

    @Autowired
    JobRepository jobRepository;

    @GetMapping(value = "/jobs")
    public ResponseEntity<List<Job>> getAllJobs(){
        return new ResponseEntity<>(jobRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/jobs/{id}")
    public ResponseEntity getJob(@PathVariable Long id){
        return new ResponseEntity<>(jobRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/jobs")
    public ResponseEntity postJob(@RequestBody Job job){
        jobRepository.save(job);
        return new ResponseEntity<>(job, HttpStatus.CREATED);
    }

    @DeleteMapping(value = "/jobs/{id}")
    public ResponseEntity deleteJob(@PathVariable Long id) {
        jobRepository.deleteById(id);
        return new ResponseEntity(null, HttpStatus.OK);
    }

    @PutMapping(value = "/jobs/{id}")
    public ResponseEntity updateJob(@RequestBody Job updatedJob, @PathVariable Long id) {
        jobRepository.save(updatedJob);
        return new ResponseEntity(updatedJob, HttpStatus.OK);
    }


}
