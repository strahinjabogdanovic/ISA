package com.example.demo.model;

import com.example.demo.model.dto.RegistrationDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.naming.Name;
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

    public User(RegistrationDTO registrationDTO)
    {
        name = registrationDTO.Name;
        surname = registrationDTO.Surname;
        email = registrationDTO.Username;
        password = registrationDTO.Password;
        phone = registrationDTO.Phone;
        JMBG = registrationDTO.Jmbg;
        address.setStreet(registrationDTO.Address);
        address.setTown(registrationDTO.Town);
        address.setState(registrationDTO.State);
        if (registrationDTO.Gender.toLowerCase().equals(Gender.Male.toString().toLowerCase()))
        {
            gender = Gender.Male;
        }
        else
        {
            gender = Gender.Female;
        }
    }

}
