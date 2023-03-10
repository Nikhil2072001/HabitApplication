package com.example.demo.Controllers;

import com.example.demo.RequestDTO.UserRequestDTO;
import com.example.demo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class userController {
    @Autowired
    UserService userService;
    @PostMapping("/add_user")
    public ResponseEntity<String> addUser(@RequestBody()UserRequestDTO userRequestDTO){
        userService.addUser(userRequestDTO);
        return new ResponseEntity<>("Successfully added", HttpStatus.CREATED);
    }
}
