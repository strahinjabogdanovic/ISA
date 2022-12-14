package com.example.demo.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class RegistrationDTO {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String rePassword;
    private String address;
    private String town;
    private String state;
    private String phone;
}
