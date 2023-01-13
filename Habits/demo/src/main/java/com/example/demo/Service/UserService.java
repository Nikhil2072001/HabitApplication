package com.example.demo.Service;

import com.example.demo.Convertors.UserConvertor;
import com.example.demo.Entity.User;
import com.example.demo.Repository.UserRepository;
import com.example.demo.RequestDTO.UserRequestDTO;
import com.example.demo.Service.exception.UsernameNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserService {
    @Autowired
    UserRepository userRepository;
    public void addUser(UserRequestDTO userRequestDTO){
        try {
            User user = UserConvertor.convertDtoToEntity(userRequestDTO);
            userRepository.save(user);
        }catch (Exception e){
            log.info("createUser has caused an error");

        }
    }
    public User getProfilePage(String email,String password) throws UsernameNotFoundException {


                User user = userRepository.findByemailOrPassword(email, password)
                        .orElseThrow(() ->
                                new UsernameNotFoundException("User not found with username or password: "));
return user;

    }
}
