package com.example.demo.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private String name;
@Column(unique = true,nullable = false)
    private String email;
@Column(nullable = false)
    private String password;
//@OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
//    private List<habits> habitsList;
private List<Habits>habitsList;
}
