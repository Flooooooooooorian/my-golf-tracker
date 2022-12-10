package com.github.flooooooooooorian.mygolftracker.service.mapper;

import com.github.flooooooooooorian.mygolftracker.model.Trajectory;
import com.github.flooooooooooorian.mygolftracker.model.api.trackman.TrackmanTrajectory;

public class TrajectoryMapper {
    private TrajectoryMapper() {
    }

    public static Trajectory map(TrackmanTrajectory trackmanTrajectory) {
        return Trajectory.builder()
                .x(trackmanTrajectory.x())
                .y(trackmanTrajectory.y())
                .z(trackmanTrajectory.z())
                .build();
    }
}

