package com.github.flooooooooooorian.mygolftracker.model;

import lombok.Builder;

@Builder
public record Trajectory(
        double x,
        double y,
        double z
) {
}
