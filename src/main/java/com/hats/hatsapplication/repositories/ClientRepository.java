package com.hats.hatsapplication.repositories;

import com.hats.hatsapplication.models.Client;
import com.hats.hatsapplication.models.Hat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
    List<Client> findClientByFirstName(String firstName);

}
