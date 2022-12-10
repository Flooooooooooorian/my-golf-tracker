package com.github.flooooooooooorian.mygolftracker.controller;

import com.github.flooooooooooorian.mygolftracker.model.TrackmanUserLoginDto;
import com.github.flooooooooooorian.mygolftracker.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }


    @PostMapping
    void login(@RequestBody TrackmanUserLoginDto user) {
        userService.login(user.username(), user.password());
    }
}
