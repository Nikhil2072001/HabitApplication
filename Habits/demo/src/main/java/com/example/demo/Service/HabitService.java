package com.example.demo.Service;

import com.example.demo.Convertors.HabitConvertor;
import com.example.demo.Entity.Habits;
import com.example.demo.Entity.User;
import com.example.demo.Repository.HabitRepository;
import com.example.demo.Repository.UserRepository;
import com.example.demo.RequestDTO.HabitRequestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HabitService {
    @Autowired
    HabitRepository habitRepository;
    @Autowired
    UserRepository userRepository;
    public void addHabit(HabitRequestDTO habitRequestDTO){


        int userId = habitRequestDTO.getUserId();
        User user = userRepository.findById(userId).get();
        Habits habits = HabitConvertor.convertDtoToEntity(habitRequestDTO);
        habits.setUser(user);
        List<Habits> habitsList = user.getHabitsList();
        habitsList.add(habits);
user.setHabitsList(habitsList);
userRepository.save(user);

    }

}
