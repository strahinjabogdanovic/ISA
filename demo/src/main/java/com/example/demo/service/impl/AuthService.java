package com.example.demo.service.impl;

import com.example.demo.model.User;
import com.example.demo.model.dto.LoginDTO;
import com.example.demo.model.dto.UserDTO;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.IAuthService;
import org.springframework.stereotype.Service;

@Service
public class AuthService implements IAuthService {

    private final UserRepository userRepository;

    public AuthService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public UserDTO login(LoginDTO request) {
        User user = userRepository.findById(request.getEmail());
        if(user != null) {
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
        userDTO.setEmail(user.getEmail());
        return userDTO;
    }
}
