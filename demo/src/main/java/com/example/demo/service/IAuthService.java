package com.example.demo.service;

import com.example.demo.model.User;
import com.example.demo.model.dto.LoginDTO;
import com.example.demo.model.dto.UserDTO;

public interface IAuthService {

    UserDTO login(LoginDTO request);

    UserDTO registerSubject(User request);
}
