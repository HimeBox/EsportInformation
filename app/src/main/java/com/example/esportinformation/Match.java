package com.example.esportinformation;

public class Match {
    // Useless right now, will store matches information when interaction with API is completed.

    private String teamA;
    private String teamB;
    private String score;
    private String tournament;

    public Match(String teamA, String teamB, String score, String tournament) {
        this.teamA = teamA;
        this.teamB = teamB;
        this.score = score;
        this.tournament = tournament;
    }

    public String getTeamA() {
        return teamA;
    }

    public void setTeamA(String teamA) {
        this.teamA = teamA;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getTournament() {
        return tournament;
    }

    public void setTournament(String tournament) {
        this.tournament = tournament;
    }


    public String getTeamB() {
        return teamB;
    }

    public void setTeamB(String teamB) {
        this.teamB = teamB;
    }


}
