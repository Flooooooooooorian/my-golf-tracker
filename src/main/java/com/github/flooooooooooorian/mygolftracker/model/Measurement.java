package com.github.flooooooooooorian.mygolftracker.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Measurement {
    protected String id;
    protected Instant time;
    protected String kind;
    protected List<Double> teePosition;
    protected String playerDexterity;
    protected Double dynamicLie;
    protected Double impactOffset;
    protected Double impactHeight;
    protected Double attackAngle;
    protected Double launchDirection;
    protected Double ballSpeed;
    protected Double clubPath;
    protected Double clubSpeed;
    protected Double launchAngle;
    protected Double smashFactor;
    protected Double spinAxis;
    protected Double spinRate;
    protected Double swingDirection;
    protected Double swingPlane;
    protected Double swingRadius;
    protected Double dPlaneTilt;
    protected Double lowPointDistance;
    protected Double maxHeight;
    protected Double carry;
    protected Double total;
    protected Double carrySide;
    protected Double totalSide;
    protected Double landingAngle;
    protected Double hangTime;
    protected Double lastData;
    protected Double curve;
    protected List<Trajectory> ballTrajectory;
    protected List<Trajectory> clubTrajectory;
}
