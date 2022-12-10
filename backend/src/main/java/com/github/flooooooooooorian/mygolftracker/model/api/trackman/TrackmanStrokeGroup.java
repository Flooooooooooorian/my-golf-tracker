package com.github.flooooooooooorian.mygolftracker.model.api.trackman;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
public record TrackmanStrokeGroup(
        @JsonProperty("Id")
        String id,
        @JsonProperty("Club")
        String club,
        @JsonProperty("Player")
        TrackmanPlayer player,
        @JsonProperty("Tags")
        List<String> tags,
        @JsonProperty("Strokes")
        List<TrackmanStroke> strokes

) {
}
