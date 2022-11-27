package com.github.flooooooooooorian.mygolftracker.model.api.trackman;

import com.fasterxml.jackson.annotation.JsonProperty;

public record TrackmanReportDto(
        @JsonProperty("ReportId")
        String reportId
) {
}
