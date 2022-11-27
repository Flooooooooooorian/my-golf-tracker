package com.github.flooooooooooorian.mygolftracker.model;

import com.fasterxml.jackson.annotation.JsonProperty;


import java.time.Instant;
import java.util.List;

public record Report(
        @JsonProperty("Id")
        String id,
        @JsonProperty("Time")
        Instant date,
        @JsonProperty("StrokeGroups")
        List<StrokeGroup> strokeGroups
) {
}
