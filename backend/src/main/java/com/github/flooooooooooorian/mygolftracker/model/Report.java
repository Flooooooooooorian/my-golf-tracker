package com.github.flooooooooooorian.mygolftracker.model;

import lombok.Builder;
import lombok.With;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;
import java.util.List;

@Document
@Builder
@With
public record Report(
        @Id
        String id,
        Instant date,
        List<StrokeGroup> strokeGroups
) {
}
