package com.example.demo.repository;

import com.example.demo.model.User;
import com.example.demo.model.dto.RegistrationDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    User findById(String s);

    User save(RegistrationDTO user);
}
