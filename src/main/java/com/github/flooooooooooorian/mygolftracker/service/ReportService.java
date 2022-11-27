package com.github.flooooooooooorian.mygolftracker.service;

import com.github.flooooooooooorian.mygolftracker.TrackmanUserRepository;
import com.github.flooooooooooorian.mygolftracker.model.Report;
import com.github.flooooooooooorian.mygolftracker.model.TrackmanUser;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReportService {

    private final TrackmanApiService trackmanApiService;
    private final TrackmanUserRepository trackmanUserRepository;

    public ReportService(TrackmanApiService trackmanApiService, TrackmanUserRepository trackmanUserRepository) {
        this.trackmanApiService = trackmanApiService;
        this.trackmanUserRepository = trackmanUserRepository;
    }

    public List<Report> findAll() {
        return null;
    }

    public Report getReport(String userId, String reportId) {
        TrackmanUser trackmanUser = trackmanUserRepository.findById(userId).orElseThrow();
        return trackmanApiService.getReport(trackmanUser.cookie(), reportId);
    }
}
