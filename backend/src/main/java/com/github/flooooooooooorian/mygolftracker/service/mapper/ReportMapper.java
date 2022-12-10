package com.github.flooooooooooorian.mygolftracker.service.mapper;

import com.github.flooooooooooorian.mygolftracker.model.Report;
import com.github.flooooooooooorian.mygolftracker.model.api.trackman.TrackmanReport;

public class ReportMapper {

    private ReportMapper() {
    }

    public static Report map(TrackmanReport trackmanReport) {
        return Report.builder()
                .id(trackmanReport.id())
                .strokeGroups(trackmanReport.strokeGroups().stream()
                        .map(StrokeGroupMapper::map)
                        .toList())
                .date(trackmanReport.date())
                .build();
    }
}
