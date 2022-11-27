package com.github.flooooooooooorian.mygolftracker.controller;


import com.github.flooooooooooorian.mygolftracker.model.Report;
import com.github.flooooooooooorian.mygolftracker.service.ReportService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/report")
public class ReportController {

    private final ReportService reportService;

    public ReportController(ReportService reportService) {
        this.reportService = reportService;
    }

    @GetMapping
    List<Report> getReports() {
        return reportService.findAll();
    }

    @GetMapping("/{userId}/{reportId}")
    Report getReport(@PathVariable String reportId, @PathVariable String userId) {
        return reportService.getReport(userId, reportId);
    }
}
