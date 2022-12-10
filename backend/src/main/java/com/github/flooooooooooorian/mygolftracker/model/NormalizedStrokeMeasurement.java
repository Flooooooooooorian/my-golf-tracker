package com.github.flooooooooooorian.mygolftracker.model;

import lombok.*;

import java.time.Instant;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class NormalizedStrokeMeasurement extends Measurement {
    protected Double landingHeight;
    protected Boolean withBallAndClub;

    @Builder(builderMethodName = "measurementBuilder")

    public NormalizedStrokeMeasurement(String id, Instant time, String kind, List<Double> teePosition, String playerDexterity, Double dynamicLie, Double impactOffset, Double impactHeight, Double attackAngle, Double launchDirection, Double ballSpeed, Double clubPath, Double clubSpeed, Double launchAngle, Double smashFactor, Double spinAxis, Double spinRate, Double swingDirection, Double swingPlane, Double swingRadius, Double dPlaneTilt, Double lowPointDistance, Double maxHeight, Double carry, Double total, Double carrySide, Double totalSide, Double landingAngle, Double hangTime, Double lastData, Double curve, List<Trajectory> ballTrajectory, List<Trajectory> clubTrajectory, Double landingHeight, Boolean withBallAndClub) {
        super(id, time, kind, teePosition, playerDexterity, dynamicLie, impactOffset, impactHeight, attackAngle, launchDirection, ballSpeed, clubPath, clubSpeed, launchAngle, smashFactor, spinAxis, spinRate, swingDirection, swingPlane, swingRadius, dPlaneTilt, lowPointDistance, maxHeight, carry, total, carrySide, totalSide, landingAngle, hangTime, lastData, curve, ballTrajectory, clubTrajectory);
        this.landingHeight = landingHeight;
        this.withBallAndClub = withBallAndClub;
    }
}
