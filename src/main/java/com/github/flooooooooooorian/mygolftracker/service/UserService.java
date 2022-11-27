package com.github.flooooooooooorian.mygolftracker.service;

import com.github.flooooooooooorian.mygolftracker.TrackmanUserRepository;
import com.github.flooooooooooorian.mygolftracker.model.TrackmanUser;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    private final TrackmanUserRepository trackmanUserRepository;
    private final TrackmanApiService trackmanApiService;

    public UserService(TrackmanUserRepository trackmanUserRepository, TrackmanApiService trackmanApiService) {
        this.trackmanUserRepository = trackmanUserRepository;
        this.trackmanApiService = trackmanApiService;
    }
    public void login(String username, String password) {
        String cookie = trackmanApiService.login(username, password);
        TrackmanUser trackmanUser = trackmanUserRepository.findByUsername(username)
                .orElse(new TrackmanUser(null, username, cookie))
                .withCookie(cookie);
        trackmanUserRepository.save(trackmanUser);
    }
}
