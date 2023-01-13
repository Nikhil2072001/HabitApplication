package com.example.demo.Convertors;

import com.example.demo.Entity.User;
import com.example.demo.RequestDTO.UserRequestDTO;

public class UserConvertor {
    public static User convertDtoToEntity(UserRequestDTO userRequestDTO){
        User user = User.builder().name(userRequestDTO.getName()).email(userRequestDTO.getEmail()).password(userRequestDTO.getPassword())
                .build();
        return user;
    }
}
