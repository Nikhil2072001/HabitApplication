package com.example.demo.Controllers;

import com.example.demo.Entity.User;
import com.example.demo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class profilePageController {
    @Autowired
    UserService userService;

    @GetMapping("/habits/profile_page")
        public ResponseEntity<User> getProfilePage(@RequestParam("email") String email,@RequestParam("password") String password) {
        try {
            User user = userService.getProfilePage(email, password);
            return new ResponseEntity<>(user, HttpStatus.OK);
        }
        catch (Exception e){
            return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
        }

    }

}
