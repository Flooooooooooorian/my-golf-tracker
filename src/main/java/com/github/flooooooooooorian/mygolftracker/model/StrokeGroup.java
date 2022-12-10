package com.github.flooooooooooorian.mygolftracker.model;

import lombok.Builder;

import java.util.List;

@Builder
public record StrokeGroup(
        String id,
        String club,
        Player player,
        List<String> tags,
        List<Stroke> strokes) {
}
