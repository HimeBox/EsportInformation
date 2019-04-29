package MatchList;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Game implements Serializable {
    @SerializedName("winner_type")
    @Expose
    private String winnerType;
    @SerializedName("winner")
    @Expose
    private Winner winner;
    @SerializedName("position")
    @Expose
    private Integer position;
    @SerializedName("match_id")
    @Expose
    private Integer matchId;
    @SerializedName("length")
    @Expose
    private Object length;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("finished")
    @Expose
    private Boolean finished;
    @SerializedName("begin_at")
    @Expose
    private Object beginAt;

    public String getWinnerType() {
        return winnerType;
    }

    public void setWinnerType(String winnerType) {
        this.winnerType = winnerType;
    }

    public Winner getWinner() {
        return winner;
    }

    public void setWinner(Winner winner) {
        this.winner = winner;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public Integer getMatchId() {
        return matchId;
    }

    public void setMatchId(Integer matchId) {
        this.matchId = matchId;
    }

    public Object getLength() {
        return length;
    }

    public void setLength(Object length) {
        this.length = length;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getFinished() {
        return finished;
    }

    public void setFinished(Boolean finished) {
        this.finished = finished;
    }

    public Object getBeginAt() {
        return beginAt;
    }

    public void setBeginAt(Object beginAt) {
        this.beginAt = beginAt;
    }
}
