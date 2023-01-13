package com.example.demo.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table
@Builder
public class Habits {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String habitName;
    @ManyToOne
    @JoinColumn
private User user;
}
