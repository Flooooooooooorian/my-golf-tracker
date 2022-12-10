package com.github.flooooooooooorian.mygolftracker.model.api.trackman;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class TrackmanMeasurement {
    @JsonProperty("Id")
    protected String id;
    @JsonProperty("Time")
    protected Instant time;
    @JsonProperty("Kind")
    protected String kind;
    @JsonProperty("TeePosition")
    protected List<Double>teePosition;
    @JsonProperty("PlayerDexterity")
    protected String playerDexterity;
    @JsonProperty("DynamicLie")
    protected Double dynamicLie;
    @JsonProperty("ImpactOffset")
    protected Double impactOffset;
    @JsonProperty("ImpactHeight")
    protected Double impactHeight;
    @JsonProperty("AttackAngle")
    protected Double attackAngle;
    @JsonProperty("LaunchDirection")
    protected Double launchDirection;
    @JsonProperty("BallSpeed")
    protected Double ballSpeed;
    @JsonProperty("ClubPath")
    protected Double clubPath;
    @JsonProperty("ClubSpeed")
    protected Double clubSpeed;
    @JsonProperty("LaunchAngle")
    protected Double launchAngle;
    @JsonProperty("SmashFactor")
    protected Double smashFactor;
    @JsonProperty("SpinAxis")
    protected Double spinAxis;
    @JsonProperty("SpinRate")
    protected Double spinRate;
    @JsonProperty("SwingDirection")
    protected Double swingDirection;
    @JsonProperty("SwingPlane")
    protected Double swingPlane;
    @JsonProperty("SwingRadius")
    protected Double swingRadius;
    @JsonProperty("DPlaneTilt")
    protected Double dPlaneTilt;
    @JsonProperty("LowPointDistance")
    protected Double lowPointDistance;
    @JsonProperty("MaxHeight")
    protected Double maxHeight;
    @JsonProperty("Carry")
    protected Double carry;
    @JsonProperty("Total")
    protected Double total;
    @JsonProperty("CarrySide")
    protected Double carrySide;
    @JsonProperty("TotalSide")
    protected Double totalSide;
    @JsonProperty("LandingAngle")
    protected Double landingAngle;
    @JsonProperty("HangTime")
    protected Double hangTime;
    @JsonProperty("LastData")
    protected Double lastData;
    @JsonProperty("Curve")
    protected Double curve;
    @JsonProperty("BallTrajectory")
    protected List<TrackmanTrajectory> ballTrajectory;
    @JsonProperty("ClubTrajectory")
    protected List<TrackmanTrajectory> clubTrajectory;
}
