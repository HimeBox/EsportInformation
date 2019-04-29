package GameDetail;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Round implements Serializable {
    @SerializedName("winner_team")
    @Expose
    private Integer winnerTeam;
    @SerializedName("winner_side")
    @Expose
    private String winnerSide;
    @SerializedName("terrorists")
    @Expose
    private Integer terrorists;
    @SerializedName("round")
    @Expose
    private Integer round;
    @SerializedName("outcome")
    @Expose
    private String outcome;
    @SerializedName("ct")
    @Expose
    private Integer ct;

    public Integer getWinnerTeam() {
        return winnerTeam;
    }

    public void setWinnerTeam(Integer winnerTeam) {
        this.winnerTeam = winnerTeam;
    }

    public String getWinnerSide() {
        return winnerSide;
    }

    public void setWinnerSide(String winnerSide) {
        this.winnerSide = winnerSide;
    }

    public Integer getTerrorists() {
        return terrorists;
    }

    public void setTerrorists(Integer terrorists) {
        this.terrorists = terrorists;
    }

    public Integer getRound() {
        return round;
    }

    public void setRound(Integer round) {
        this.round = round;
    }

    public String getOutcome() {
        return outcome;
    }

    public void setOutcome(String outcome) {
        this.outcome = outcome;
    }

    public Integer getCt() {
        return ct;
    }

    public void setCt(Integer ct) {
        this.ct = ct;
    }
}
