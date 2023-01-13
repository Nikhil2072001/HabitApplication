package com.example.demo.Controllers;

import com.example.demo.RequestDTO.UserRequestDTO;
import com.example.demo.Service.RegistrationLoginService;
import com.example.demo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class RegistrationLoginController {
    @Autowired
    RegistrationLoginService registrationLoginService;
    @Autowired
    UserService userService;
    @GetMapping("/habits/login_page")
    public ResponseEntity<String> login(@RequestParam("email") String email,@RequestParam("password")String password){
        String s = registrationLoginService.login(email,password);
        return new ResponseEntity<>(s, HttpStatus.OK);
    }
    @PostMapping("/habits/registration_page")
    public ResponseEntity<String> registration(UserRequestDTO userRequestDTO){
        userService.addUser(userRequestDTO);
        return new ResponseEntity<>("user registered",HttpStatus.CREATED);
    }
}
