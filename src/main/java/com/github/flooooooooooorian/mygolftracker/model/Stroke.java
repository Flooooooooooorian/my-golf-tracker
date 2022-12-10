package com.github.flooooooooooorian.mygolftracker.model;

import java.time.Instant;
import java.util.List;

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
