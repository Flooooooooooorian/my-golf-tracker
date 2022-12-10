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
public class TrackmanStrokeMeasurement extends TrackmanMeasurement {
    @JsonProperty("LowPointHeight")
    protected Double lowPointHeight;
    @JsonProperty("LowPointSide")
    protected Double lowPointside;
}