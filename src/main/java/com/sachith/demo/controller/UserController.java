package com.sachith.demo.controller;

import com.sachith.demo.dto.UserRequestDTO;
import com.sachith.demo.entity.UserEntity;
import com.sachith.demo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping
    public ResponseEntity<UserEntity> saveUser(@RequestBody @Valid UserRequestDTO userRequestDTO){
        return new ResponseEntity<>(userService.saveUser(userRequestDTO), HttpStatus.CREATED);
    }

    @GetMapping(path = "/users/{id}")
    public ResponseEntity<UserEntity> getUserByIdPath(@PathVariable Long id) {
        //TODO implement this feature
        return ResponseEntity.ok().body(new UserEntity());
    }

    @GetMapping
    public String index(){
        return "Hello";
    }

}
