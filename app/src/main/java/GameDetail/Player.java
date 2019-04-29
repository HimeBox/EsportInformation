package GameDetail;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Player implements Serializable {

    @SerializedName("team")
    @Expose
    private Team_ team;
    @SerializedName("rating")
    @Expose
    private Double rating;
    @SerializedName("player")
    @Expose
    private Player_ player;
    @SerializedName("opponent")
    @Expose
    private Opponent opponent;
    @SerializedName("kills")
    @Expose
    private Integer kills;
    @SerializedName("kast")
    @Expose
    private Double kast;
    @SerializedName("k_d_diff")
    @Expose
    private Integer kDDiff;
    @SerializedName("headshots")
    @Expose
    private Integer headshots;
    @SerializedName("game_id")
    @Expose
    private Integer gameId;
    @SerializedName("flash_assists")
    @Expose
    private Integer flashAssists;
    @SerializedName("first_kills_diff")
    @Expose
    private Integer firstKillsDiff;
    @SerializedName("deaths")
    @Expose
    private Integer deaths;
    @SerializedName("assists")
    @Expose
    private Integer assists;
    @SerializedName("adr")
    @Expose
    private Double adr;

    public Team_ getTeam() {
        return team;
    }

    public void setTeam(Team_ team) {
        this.team = team;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public Player_ getPlayer() {
        return player;
    }

    public void setPlayer(Player_ player) {
        this.player = player;
    }

    public Opponent getOpponent() {
        return opponent;
    }

    public void setOpponent(Opponent opponent) {
        this.opponent = opponent;
    }

    public Integer getKills() {
        return kills;
    }

    public void setKills(Integer kills) {
        this.kills = kills;
    }

    public Double getKast() {
        return kast;
    }

    public void setKast(Double kast) {
        this.kast = kast;
    }

    public Integer getKDDiff() {
        return kDDiff;
    }

    public void setKDDiff(Integer kDDiff) {
        this.kDDiff = kDDiff;
    }

    public Integer getHeadshots() {
        return headshots;
    }

    public void setHeadshots(Integer headshots) {
        this.headshots = headshots;
    }

    public Integer getGameId() {
        return gameId;
    }

    public void setGameId(Integer gameId) {
        this.gameId = gameId;
    }

    public Integer getFlashAssists() {
        return flashAssists;
    }

    public void setFlashAssists(Integer flashAssists) {
        this.flashAssists = flashAssists;
    }

    public Integer getFirstKillsDiff() {
        return firstKillsDiff;
    }

    public void setFirstKillsDiff(Integer firstKillsDiff) {
        this.firstKillsDiff = firstKillsDiff;
    }

    public Integer getDeaths() {
        return deaths;
    }

    public void setDeaths(Integer deaths) {
        this.deaths = deaths;
    }

    public Integer getAssists() {
        return assists;
    }

    public void setAssists(Integer assists) {
        this.assists = assists;
    }

    public Double getAdr() {
        return adr;
    }

    public void setAdr(Double adr) {
        this.adr = adr;
    }
}