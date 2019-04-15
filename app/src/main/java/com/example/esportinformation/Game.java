package com.example.esportinformation;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Game {

    @SerializedName("begin_at")
    @Expose
    private Object beginAt;
    @SerializedName("finished")
    @Expose
    private Object finished;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("length")
    @Expose
    private Object length;
    @SerializedName("match_id")
    @Expose
    private Integer matchId;
    @SerializedName("position")
    @Expose
    private Integer position;
    @SerializedName("winner")
    @Expose
    private Winner winner;
    @SerializedName("winner_type")
    @Expose
    private Object winnerType;

    public Object getBeginAt() {
        return beginAt;
    }

    public void setBeginAt(Object beginAt) {
        this.beginAt = beginAt;
    }

    public Object getFinished() {
        return finished;
    }

    public void setFinished(Object finished) {
        this.finished = finished;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Object getLength() {
        return length;
    }

    public void setLength(Object length) {
        this.length = length;
    }

    public Integer getMatchId() {
        return matchId;
    }

    public void setMatchId(Integer matchId) {
        this.matchId = matchId;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public Winner getWinner() {
        return winner;
    }

    public void setWinner(Winner winner) {
        this.winner = winner;
    }

    public Object getWinnerType() {
        return winnerType;
    }

    public void setWinnerType(Object winnerType) {
        this.winnerType = winnerType;
    }
}
