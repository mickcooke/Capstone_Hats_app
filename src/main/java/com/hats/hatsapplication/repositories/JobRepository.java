package com.hats.hatsapplication.repositories;

import com.hats.hatsapplication.models.Hat;
import com.hats.hatsapplication.models.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobRepository extends JpaRepository<Job, Long> {

//    List<Job> findJobByName(String name);

//    List<Job> getAllJobs();

    List<Job> findByPaidTrue();

    List<Job> findByPaidFalse();

    List<Job> findByCompletedFalse();

    List<Job> findByCompletedFalseAndClientHatId(Long id);
}
