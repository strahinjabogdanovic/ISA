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
@Table(name="userEntity")

public class User {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String email;
    private String password;
    private String name;
    private String surname;
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Address address;
    private String phone;
    private String JMBG;
    private Gender gender;
    private String profession;
    private String workPlace;
    private UserType userType;
    private boolean passwordChanged;
    @Column(nullable = true)
    private boolean activated;

    public String getFullName() { return name + " " + surname;}


}
