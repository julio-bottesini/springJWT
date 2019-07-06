package com.bottesini.jwtexample.controller;

import com.bottesini.jwtexample.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static java.util.Arrays.asList;

@RestController
@RequestMapping("/rs/v1/users")
public class UserController {

    @GetMapping
    public List<User> getAllUsers(){
        return asList(new User(1L, "Julio"));
    }
}
