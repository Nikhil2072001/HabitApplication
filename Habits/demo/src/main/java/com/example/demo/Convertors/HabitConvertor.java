package com.example.demo.Convertors;

import com.example.demo.Entity.Habits;
import com.example.demo.Entity.User;
import com.example.demo.RequestDTO.HabitRequestDTO;
import com.example.demo.RequestDTO.UserRequestDTO;

public class HabitConvertor {
    public static Habits convertDtoToEntity(HabitRequestDTO habitRequestDTO){
        Habits habits = Habits.builder().habitName(habitRequestDTO.getName()).build();
        return habits;
    }
}
