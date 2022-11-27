package com.github.flooooooooooorian.mygolftracker.service;

import com.github.flooooooooooorian.mygolftracker.model.Report;
import com.github.flooooooooooorian.mygolftracker.model.api.trackman.TrackmanReportDto;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class TrackmanApiService {

    private final WebClient webClient = WebClient.create("https://mytrackman.com");
    private final String TRACKMAN_COOKIE_NAME = ".ASPXAUTH";

    public String login(String username, String password) {
        ResponseEntity<Void> loginResponse = webClient.post()
                .uri("/api/Account/login")
                .contentType(MediaType.APPLICATION_FORM_URLENCODED)
                .bodyValue("UserName=" + username + "&Password=" + password + "&RememberMe=true")
                .retrieve()
                .toBodilessEntity()
                .block();

        return loginResponse.getHeaders().get("Set-Cookie").get(0).split("=")[1].split(";")[0];
    }

    public Report getReport(String userCookie, String reportId) {
        return webClient.post()
                .uri("/api/dynamicreports/getreport")
                .contentType(MediaType.APPLICATION_JSON)
                .bodyValue(new TrackmanReportDto(reportId))
                .cookie(TRACKMAN_COOKIE_NAME, userCookie)
                .retrieve()
                .bodyToMono(Report.class)
                .block();
    }
}
