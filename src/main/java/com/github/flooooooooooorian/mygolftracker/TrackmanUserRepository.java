package com.github.flooooooooooorian.mygolftracker;

import com.github.flooooooooooorian.mygolftracker.model.TrackmanUser;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TrackmanUserRepository extends MongoRepository<TrackmanUser, String> {
    Optional<TrackmanUser> findByUsername(String username);
}

