package com.github.flooooooooooorian.mygolftracker.model;

import lombok.With;
import org.springframework.data.annotation.Id;

@With
public record TrackmanUser(
        @Id
        String id,
        String username,
        String cookie){

}
