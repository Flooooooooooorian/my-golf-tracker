package com.github.flooooooooooorian.mygolftracker.model;

import lombok.Builder;

@Builder
public record Player(
                String id,
                String name,
                String gender
) {
}
