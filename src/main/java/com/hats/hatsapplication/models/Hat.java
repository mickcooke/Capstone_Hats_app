package com.hats.hatsapplication.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="hats")
public class Hat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="name")
    private String name;
    @Column(name="icon_name")
    private String iconName;


    @JsonIgnoreProperties({"hats"})
    @ManyToOne
    @JoinColumn(name="user_id", nullable = false)
    private User user;

    @JsonIgnoreProperties({"hat"})
    @OneToMany(mappedBy="hat")
    private List<Client> clients;


    public Hat(String name, String iconName, User user) {
        this.name = name;
        this.iconName = iconName;
        this.user = user;
        this.clients = new ArrayList<Client>();
    }

    public Hat(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIconName() {
        return iconName;
    }

    public void setIconName(String iconName) {
        this.iconName = iconName;
    }

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void addClient(Client client) {
        this.clients.add(client);
    }
}
