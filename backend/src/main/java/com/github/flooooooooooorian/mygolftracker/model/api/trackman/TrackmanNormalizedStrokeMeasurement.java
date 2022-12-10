package com.github.flooooooooooorian.mygolftracker.model.api.trackman;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class TrackmanNormalizedStrokeMeasurement extends TrackmanMeasurement {
    @JsonProperty("LandingHeight")
    protected Double landingHeight;
    @JsonProperty("_withBallAndClub")
    protected Boolean withBallAndClub;
}
