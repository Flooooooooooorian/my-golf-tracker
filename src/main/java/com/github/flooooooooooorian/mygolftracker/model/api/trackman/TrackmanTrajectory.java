package com.github.flooooooooooorian.mygolftracker.model.api.trackman;

import com.fasterxml.jackson.annotation.JsonProperty;

public record TrackmanTrajectory(
        @JsonProperty("X")
        double x,
        @JsonProperty("Y")
        double y,
        @JsonProperty("Z")
        double z
) {
}
