package com.hats.hatsapplication.repositories;

import com.hats.hatsapplication.models.Hat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HatRepository extends JpaRepository<Hat, Long> {
    List<Hat> findHatByName(String name);
}
