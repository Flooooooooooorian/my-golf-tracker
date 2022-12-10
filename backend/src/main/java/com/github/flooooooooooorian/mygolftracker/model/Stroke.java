package com.github.flooooooooooorian.mygolftracker.model;

import lombok.Builder;

import java.time.Instant;
import java.util.List;

@Builder
public record Stroke(
        String id,
        Instant time,
        String club,
        String ball,
        StrokeMeasurement measurement,
        NormalizedStrokeMeasurement normalizedMeasurement,
        List<String> videos
) {
}
