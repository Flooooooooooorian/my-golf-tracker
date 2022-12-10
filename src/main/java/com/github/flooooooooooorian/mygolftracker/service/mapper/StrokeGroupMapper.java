package com.github.flooooooooooorian.mygolftracker.service.mapper;

import com.github.flooooooooooorian.mygolftracker.model.StrokeGroup;
import com.github.flooooooooooorian.mygolftracker.model.api.trackman.TrackmanStrokeGroup;

public class StrokeGroupMapper {
    private StrokeGroupMapper() {
    }

    public static StrokeGroup map(TrackmanStrokeGroup trackmanStrokeGroup) {
        return StrokeGroup.builder()
                .id(trackmanStrokeGroup.id())
                .club(trackmanStrokeGroup.club())
                .player(PlayerMapper.map(trackmanStrokeGroup.player()))
                .strokes(trackmanStrokeGroup.strokes().stream()
                        .map(StrokeMapper::map)
                        .toList())
                .tags(trackmanStrokeGroup.tags())
                .build();
    }
}

