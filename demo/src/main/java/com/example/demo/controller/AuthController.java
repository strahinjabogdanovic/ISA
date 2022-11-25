package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.model.dto.LoginDTO;
import com.example.demo.model.dto.UserDTO;
import com.example.demo.service.IAuthService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final IAuthService authService;

    public AuthController(IAuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/login")
    public UserDTO login(@RequestBody LoginDTO data){
        return authService.login(data);
    }

    @PostMapping("/registration")
    public UserDTO registration(@RequestBody User user) {
        return authService.registerSubject(user);
    }

}
