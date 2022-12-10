package com.github.flooooooooooorian.mygolftracker.model;

import lombok.Data;
import lombok.EqualsAndHashCode;


@Data
@EqualsAndHashCode(callSuper = true)
public class StrokeMeasurement extends Measurement {
    protected Double lowPointHeight;
    protected Double lowPointside;
}