package com.hats.hatsapplication.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="jobs")
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name="description")
    private String description;

    @Column(name="notes")
    private String notes;

    @Column(name="started")
    private LocalDateTime started;

    @Column(name="ended")
    private LocalDateTime ended;

    @Column(name= "time_taken")
    private int timeTaken;

    @Column(name= "completed")
    private Boolean completed;

    @Column(name= "paid")
    private Boolean paid;

    @JsonIgnoreProperties({"jobs"})
    @ManyToOne
    @JoinColumn(name="client_id", nullable = false)
    private Client client;

    public Job(String name, String description, String notes, Client client, String started, String ended,  Boolean completed, Boolean paid) {
        this.name = name;
        this.description = description;
        this.notes = notes;
        this.client = client;
        this.started = this.formatTimeInput(started);
        this.ended = this.formatTimeInput(ended);
        this.timeTaken = 0;
        this.completed = completed;
        this.paid = paid;

    }

    public Job() {
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Long getId() {
        return id;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public LocalDateTime getStarted() {
        return started;
    }

    public void setStarted(LocalDateTime started) {
        this.started = started;
    }

    public LocalDateTime getEnded() {
        return ended;
    }

    public void setEnded(LocalDateTime ended) {
        this.ended = ended;
    }

    public int getTimeTaken() {
        return timeTaken;
    }

    public void setTimeTaken(int timeTaken) {
        this.timeTaken = timeTaken;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }

    public Boolean getPaid() {
        return paid;
    }

    public void setPaid(Boolean paid) {
        this.paid = paid;
    }

    public LocalDateTime formatTimeInput(String givenTime) {
        String[] splitString = givenTime.split("[/ :]");
        LocalDateTime newDateTime =  LocalDateTime.of(
                Integer.parseInt(splitString[0]),
                Integer.parseInt(splitString[1]),
                Integer.parseInt(splitString[2]),
                Integer.parseInt(splitString[3]),
                Integer.parseInt(splitString[4]));
        return newDateTime;
    }
}
