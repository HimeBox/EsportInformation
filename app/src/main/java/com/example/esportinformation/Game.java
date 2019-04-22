package com.example.esportinformation;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class Game implements Serializable {

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
    @SerializedName("map")
    @Expose
    private Object map;
    @SerializedName("match")
    @Expose
    private Match match;
    @SerializedName("match_id")
    @Expose
    private Integer matchId;
    @SerializedName("players")
    @Expose
    private List<Player> players = null;
    @SerializedName("position")
    @Expose
    private Integer position;
    @SerializedName("rounds")
    @Expose
    private List<Round> rounds = null;
    @SerializedName("teams")
    @Expose
    private List<Team_> teams = null;
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

    public Object getMap() {
        return map;
    }

    public void setMap(Object map) {
        this.map = map;
    }

    public Match getMatch() {
        return match;
    }

    public void setMatch(Match match) {
        this.match = match;
    }

    public Integer getMatchId() {
        return matchId;
    }

    public void setMatchId(Integer matchId) {
        this.matchId = matchId;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public List<Round> getRounds() {
        return rounds;
    }

    public void setRounds(List<Round> rounds) {
        this.rounds = rounds;
    }

    public List<Team_> getTeams() {
        return teams;
    }

    public void setTeams(List<Team_> teams) {
        this.teams = teams;
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
