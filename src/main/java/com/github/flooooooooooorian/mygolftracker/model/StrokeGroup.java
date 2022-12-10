package com.github.flooooooooooorian.mygolftracker.model;

import java.util.List;

public record StrokeGroup(
        String id,
        String club,
        Player player,
        List<String> tags,
        List<Stroke> strokes) {
}
