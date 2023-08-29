package com.hats.hatsapplication.models;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="first_name")
    private String firstName;
    @Column(name="last_name")
    private String lastName;
    @Column(name="email_address")
    private String emailAddress;
    @Column(name="address_1")
    private String address1;
    @Column(name="address_2")
    private String address2;
    @Column(name="postcode")
    private String postcode;
    @Column(name="country")
    private String country;
    @JsonIgnoreProperties({"user"})
    @OneToMany(mappedBy="user")
    private List<Hat> hats;

    public User(String firstName, String lastName, String emailAddress, String address1, String address2, String postcode, String country) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.address1 = address1;
        this.address2 = address2;
        this.postcode = postcode;
        this.country = country;
        this.hats = new ArrayList<Hat>();
    }
    public User(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }



    public List<Hat> getHats() {
        return hats;
    }

    public void setHats(List<Hat> hats) {
        this.hats = hats;
    }

    public void addHat(Hat hat){
        this.hats.add(hat);
    }
}
