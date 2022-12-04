package com.github.flooooooooooorian.mygolftracker.model.api.trackman;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.Instant;
import java.util.List;

public record TrackmanStroke(
        @JsonProperty("Id")
        String id,
        @JsonProperty("Time")
        Instant time,
        @JsonProperty("Club")
        String club,
        @JsonProperty("Ball")
        String ball,
        @JsonProperty("Measurement")
        TrackmanStrokeMeasurement measurement,
        @JsonProperty("NormalizedMeasurement")
        TrackmanNormalizedStrokeMeasurement normalizedMeasurement,
        @JsonProperty("Videos")
        List<String> videos
) {
}
