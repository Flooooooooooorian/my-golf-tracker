package com.github.flooooooooooorian.mygolftracker.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class NormalizedStrokeMeasurement extends Measurement {
    protected Double landingHeight;
    protected Boolean withBallAndClub;
}
