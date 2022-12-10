package com.github.flooooooooooorian.mygolftracker.service.mapper;

import com.github.flooooooooooorian.mygolftracker.model.Player;
import com.github.flooooooooooorian.mygolftracker.model.api.trackman.TrackmanPlayer;

public class PlayerMapper {
    private PlayerMapper() {
    }

    public static Player map(TrackmanPlayer trackmanPlayer) {
        return Player.builder()
                .id(trackmanPlayer.id())
                .name(trackmanPlayer.name())
                .gender(trackmanPlayer.gender())
                .build();
    }
}

