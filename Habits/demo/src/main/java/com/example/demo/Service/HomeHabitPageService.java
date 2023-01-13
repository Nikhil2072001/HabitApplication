package com.example.demo.Service;

import com.example.demo.Entity.Habits;
import com.example.demo.Entity.User;
import com.example.demo.Repository.HomeHabitPageRepository;
import com.example.demo.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HomeHabitPageService {
    @Autowired
    HomeHabitPageRepository homeHabitPageRepository;
    @Autowired
    UserRepository userRepository;
    @Autowired
    HabitService habitService;

    public List<List<Habits>> getHabits(String email){
        boolean flag = userRepository.existsByemail(email);
        List<User> habitsList = userRepository.findAll();
        List<List<Habits>> list = new ArrayList<>();
        for(User user: habitsList){
            List<Habits> l = new ArrayList<>();
           l = user.getHabitsList();
           list.add(l);

        }
        return list;

    }
}
