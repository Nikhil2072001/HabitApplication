package com.example.demo.Controllers;

import com.example.demo.Entity.Habits;
import com.example.demo.RequestDTO.HabitRequestDTO;
import com.example.demo.Service.HabitService;
import com.example.demo.Service.HomeHabitPageService;
import com.example.demo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HomeHabitPageController {
    @Autowired
    HabitService habitService;
    @Autowired
    HomeHabitPageService homeHabitPageService;
    @GetMapping("/habits/get_habits")
    public ResponseEntity<List<List<Habits>>> getHabits(@RequestParam("email") String email){
        List<List<Habits>> l=  homeHabitPageService.getHabits(email);
        return new ResponseEntity<>(l, HttpStatus.OK);
    }
    @PostMapping("/habits/add_habit")
    public ResponseEntity<String> addHabit(@RequestParam() HabitRequestDTO habitRequestDTO){
        habitService.addHabit(habitRequestDTO);
        return new ResponseEntity<>("Successfully added",HttpStatus.CREATED);
    }
}
