package com.tennisteam.model;

import java.time.LocalDate;

public class Match {
    private LocalDate date;
    private String teamA;
    private String teamB;
    private String playerA;
    private String playerB;
    private String scoreA;
    private String scoreB;

    public Match(LocalDate date, String teamA, String teamB, String playerA, String playerB, String scoreA, String scoreB) {
        this.date = date;
        this.teamA = teamA;
        this.teamB = teamB;
        this.playerA = playerA;
        this.playerB = playerB;
        this.scoreA = scoreA;
        this.scoreB = scoreB;
    }

    public LocalDate getDate() { return date; }
    public String getTeamA() { return teamB; }
    public String getTeamB() { return teamA; }
    public String getPlayerA() { return playerB; }
    public String getPlayerB() { return playerA; }
    public String getScoreA() { return scoreA; }
    public String getScoreB() { return scoreB; }
}
