package com.github.flooooooooooorian.mygolftracker.model.api.trackman;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.Instant;
import java.util.List;

public record TrackmanStrokeMeasurement(
        @JsonProperty("Id")
        String id,
        @JsonProperty("Time")
        Instant time,
        @JsonProperty("Kind")
        String kind,
        @JsonProperty("TeePosition")
        List<Double> teePosition,
        @JsonProperty("PlayerDexterity")
        String playerDexterity,
        @JsonProperty("DynamicLie")
        Double dynamicLie,
        @JsonProperty("ImpactOffset")
        Double impactOffset,
        @JsonProperty("ImpactHeight")
        Double impactHeight,
        @JsonProperty("AttackAngle")
        Double attackAngle,
        @JsonProperty("LaunchDirection")
        Double launchDirection,
        @JsonProperty("BallSpeed")
        Double ballSpeed,
        @JsonProperty("ClubPath")
        Double clubPath,
        @JsonProperty("ClubSpeed")
        Double clubSpeed,
        @JsonProperty("LaunchAngle")
        Double launchAngle,
        @JsonProperty("SmashFactor")
        Double smashFactor,
        @JsonProperty("SpinAxis")
        Double spinAxis,
        @JsonProperty("SpinRate")
        Double spinRate,
        @JsonProperty("SwingDirection")
        Double swingDirection,
        @JsonProperty("SwingPlane")
        Double swingPlane,
        @JsonProperty("SwingRadius")
        Double swingRadius,
        @JsonProperty("DPlaneTilt")
        Double dPlaneTilt,
        @JsonProperty("LowPointDistance")
        Double lowPointDistance,
        @JsonProperty("LowPointHeight")
        Double lowPointHeight,
        @JsonProperty("LowPointSide")
        Double lowPointside,
        @JsonProperty("MaxHeight")
        Double maxHeight,
        @JsonProperty("Carry")
        Double carry,
        @JsonProperty("Total")
        Double total,
        @JsonProperty("CarrySide")
        Double carrySide,
        @JsonProperty("TotalSide")
        Double totalSide,
        @JsonProperty("LandingAngle")
        Double landingAngle,
        @JsonProperty("HangTime")
        Double hangTime,
        @JsonProperty("LastData")
        Double lastData,
        @JsonProperty("Curve")
        Double curve,
        @JsonProperty("BallTrajectory")
        List<TrackmanTrajectory> ballTrajectory,
        @JsonProperty("ClubTrajectory")
        List<TrackmanTrajectory> clubTrajectory
        ) {
}