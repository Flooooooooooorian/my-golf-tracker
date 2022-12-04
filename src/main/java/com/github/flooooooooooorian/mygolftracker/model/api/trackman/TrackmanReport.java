package com.github.flooooooooooorian.mygolftracker.model.api.trackman;

import com.fasterxml.jackson.annotation.JsonProperty;


import java.time.Instant;
import java.util.List;

public record TrackmanReport(
        @JsonProperty("Id")
        String id,
        @JsonProperty("Time")
        Instant date,
        @JsonProperty("StrokeGroups")
        List<TrackmanStrokeGroup> strokeGroups
) {
}
