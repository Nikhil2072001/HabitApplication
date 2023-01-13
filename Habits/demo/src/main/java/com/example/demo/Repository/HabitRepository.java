package com.example.demo.Repository;

import com.example.demo.Entity.Habits;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HabitRepository extends JpaRepository<Habits,Integer> {
}
