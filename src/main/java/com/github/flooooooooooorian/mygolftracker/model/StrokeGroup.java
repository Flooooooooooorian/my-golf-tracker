package com.github.flooooooooooorian.mygolftracker.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
public record StrokeGroup(
        @JsonProperty("Id")
        String id,
        @JsonProperty("Club")
        String club,
        @JsonProperty("Strokes")
        List<Stroke> strokes

) {
}
