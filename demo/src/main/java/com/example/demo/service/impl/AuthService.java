package com.example.demo.service.impl;

import com.example.demo.model.User;
import com.example.demo.model.dto.LoginDTO;
import com.example.demo.model.dto.UserDTO;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.IAuthService;

public class AuthService implements IAuthService {

    private UserRepository userRepository;

    public AuthService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public UserDTO login(LoginDTO request) {
        User user = userRepository.findOneByUsername(request.getUsername());
        if(user == null) {
            return userToUserDTO(user);
        }
        else {
            return null;
        }
    }

    @Override
    public UserDTO registerSubject(User user) {
        User newUser = userRepository.save(user);
        return userToUserDTO(newUser);
    }

    private UserDTO userToUserDTO(User user){
        UserDTO userDTO = new UserDTO();
        userDTO.setId(user.getId());
        userDTO.setUsername(user.getEmail());
        return userDTO;
    }
}
