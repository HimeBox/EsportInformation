package com.example.esportinformation;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Round implements Serializable {

    @SerializedName("ct")
    @Expose
    private Integer ct;
    @SerializedName("outcome")
    @Expose
    private String outcome;
    @SerializedName("round")
    @Expose
    private Integer round;
    @SerializedName("terrorists")
    @Expose
    private Integer terrorists;
    @SerializedName("winner_side")
    @Expose
    private String winnerSide;
    @SerializedName("winner_team")
    @Expose
    private Integer winnerTeam;

    public Integer getCt() {
        return ct;
    }

    public void setCt(Integer ct) {
        this.ct = ct;
    }

    public String getOutcome() {
        return outcome;
    }

    public void setOutcome(String outcome) {
        this.outcome = outcome;
    }

    public Integer getRound() {
        return round;
    }

    public void setRound(Integer round) {
        this.round = round;
    }

    public Integer getTerrorists() {
        return terrorists;
    }

    public void setTerrorists(Integer terrorists) {
        this.terrorists = terrorists;
    }

    public String getWinnerSide() {
        return winnerSide;
    }

    public void setWinnerSide(String winnerSide) {
        this.winnerSide = winnerSide;
    }

    public Integer getWinnerTeam() {
        return winnerTeam;
    }

    public void setWinnerTeam(Integer winnerTeam) {
        this.winnerTeam = winnerTeam;
    }

}
