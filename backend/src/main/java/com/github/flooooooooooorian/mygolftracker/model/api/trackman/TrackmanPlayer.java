package com.github.flooooooooooorian.mygolftracker.model.api.trackman;

import com.fasterxml.jackson.annotation.JsonProperty;

public record TrackmanPlayer(
        @JsonProperty("Id")
        String id,
        @JsonProperty("Name")
        String name,
        @JsonProperty("Gender")
        String gender
) {
}
