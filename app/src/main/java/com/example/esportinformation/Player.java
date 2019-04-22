package com.example.esportinformation;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Player implements Serializable {

    @SerializedName("adr")
    @Expose
    private Integer adr;
    @SerializedName("assists")
    @Expose
    private Integer assists;
    @SerializedName("deaths")
    @Expose
    private Integer deaths;
    @SerializedName("first_kills_diff")
    @Expose
    private Object firstKillsDiff;
    @SerializedName("flash_assists")
    @Expose
    private Object flashAssists;
    @SerializedName("game_id")
    @Expose
    private Integer gameId;
    @SerializedName("headshots")
    @Expose
    private Integer headshots;
    @SerializedName("k_d_diff")
    @Expose
    private Object kDDiff;
    @SerializedName("kast")
    @Expose
    private Object kast;
    @SerializedName("kills")
    @Expose
    private Integer kills;
    @SerializedName("opponent")
    @Expose
    private Opponent opponent;
    @SerializedName("player")
    @Expose
    private Player_ player;
    @SerializedName("rating")
    @Expose
    private Object rating;
    @SerializedName("team")
    @Expose
    private Team team;

    public Integer getAdr() {
        return adr;
    }

    public void setAdr(Integer adr) {
        this.adr = adr;
    }

    public Integer getAssists() {
        return assists;
    }

    public void setAssists(Integer assists) {
        this.assists = assists;
    }

    public Integer getDeaths() {
        return deaths;
    }

    public void setDeaths(Integer deaths) {
        this.deaths = deaths;
    }

    public Object getFirstKillsDiff() {
        return firstKillsDiff;
    }

    public void setFirstKillsDiff(Object firstKillsDiff) {
        this.firstKillsDiff = firstKillsDiff;
    }

    public Object getFlashAssists() {
        return flashAssists;
    }

    public void setFlashAssists(Object flashAssists) {
        this.flashAssists = flashAssists;
    }

    public Integer getGameId() {
        return gameId;
    }

    public void setGameId(Integer gameId) {
        this.gameId = gameId;
    }

    public Integer getHeadshots() {
        return headshots;
    }

    public void setHeadshots(Integer headshots) {
        this.headshots = headshots;
    }

    public Object getKDDiff() {
        return kDDiff;
    }

    public void setKDDiff(Object kDDiff) {
        this.kDDiff = kDDiff;
    }

    public Object getKast() {
        return kast;
    }

    public void setKast(Object kast) {
        this.kast = kast;
    }

    public Integer getKills() {
        return kills;
    }

    public void setKills(Integer kills) {
        this.kills = kills;
    }

    public Opponent getOpponent() {
        return opponent;
    }

    public void setOpponent(Opponent opponent) {
        this.opponent = opponent;
    }

    public Player_ getPlayer() {
        return player;
    }

    public void setPlayer(Player_ player) {
        this.player = player;
    }

    public Object getRating() {
        return rating;
    }

    public void setRating(Object rating) {
        this.rating = rating;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

}