package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.model.dto.LoginDTO;
import com.example.demo.model.dto.RegistrationDTO;
import com.example.demo.model.dto.UserDTO;
import com.example.demo.service.IAuthService;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final IAuthService authService;

    public AuthController(IAuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/login")
    public UserDTO login(@RequestBody LoginDTO data){
        System.out.printf("ovde1");
        return authService.login(data);
    }

    @PostMapping("/registration")
    public UserDTO registration(@RequestBody RegistrationDTO data) {
        System.out.printf("ovde2");
        //front salje sve, back ne dobija nista
        return authService.registerSubject(data);
    }

}
