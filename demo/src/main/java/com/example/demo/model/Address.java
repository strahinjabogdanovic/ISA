package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Address {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String street;
    private String town;
    private String state;

    public String getFullAdress() { return street + ", " + town + ", " + state;}

    public Address(String street, String town, String state){
        this.street = street;
        this.town = town;
        this.state = state;
    }

}
