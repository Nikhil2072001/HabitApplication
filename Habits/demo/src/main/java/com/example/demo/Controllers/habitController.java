package com.example.demo.Controllers;

import com.example.demo.RequestDTO.HabitRequestDTO;
import com.example.demo.Service.HabitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/habit")
public class habitController {
    @Autowired
    HabitService habitService;
    @PostMapping("/add_habit")
    public ResponseEntity<String> addHabit(@RequestBody()HabitRequestDTO habitRequestDTO){
        habitService.addHabit(habitRequestDTO);
        return new ResponseEntity<>("Successfully added", HttpStatus.CREATED);
    }
}
