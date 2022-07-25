package com.sachith.demo.service;

import com.sachith.demo.dto.UserRequestDTO;
import com.sachith.demo.entity.UserEntity;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    SimpleJpaRepository userRepository;


    public UserEntity saveUser(UserRequestDTO userRequestDTO) {
        UserEntity userEntity = new UserEntity();
        userEntity.setName("Job");
        userEntity.setEmail("john@gmail.com");
        userEntity.setPhone("1234567890");

        return userEntity;
    }


}
