package com.example.demo.Repository;

import com.example.demo.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Integer> {
    Boolean existsByemailOrpassword(String email,String password);
    Boolean existsByemail(String email);

    Optional<User> findByemailOrPassword(String email, String password);
}
