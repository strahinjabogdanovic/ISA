package com.example.demo.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegistrationDTO {
    public int Id;
    public String Name;
    public String Surname;
    public String Username;
    public String Password;
    private String rePassword;
    public String Address;
    public String Town;
    public String State;
    public String Phone;
    public String Jmbg;
    public String Gender;

}

