package com.github.flooooooooooorian.mygolftracker.service.mapper;

import com.github.flooooooooooorian.mygolftracker.model.Stroke;
import com.github.flooooooooooorian.mygolftracker.model.api.trackman.TrackmanStroke;

public class StrokeMapper {
    private StrokeMapper() {
    }

    public static Stroke map(TrackmanStroke trackmanStroke) {
        return Stroke.builder()
                .id(trackmanStroke.id())
                .ball(trackmanStroke.ball())
                .club(trackmanStroke.club())
                .measurement(MeasurementMapper.map(trackmanStroke.measurement()))
                .normalizedMeasurement(MeasurementMapper.map(trackmanStroke.normalizedMeasurement()))
                .time(trackmanStroke.time())
                .videos(trackmanStroke.videos())
                .time(trackmanStroke.time())
                .build();
    }
}

