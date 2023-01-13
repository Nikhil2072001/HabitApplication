package com.example.demo.Service;

import com.example.demo.Entity.User;
import com.example.demo.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RegistrationLoginService {
    @Autowired
    UserRepository userRepository;
    public String login(String email,String password){
        boolean flag = userRepository.existsByemailOrpassword(email, password);
        if(flag)
            return "LogedIn";
        else
            return "Invalid Details";

    }
}
