package MatchList;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Opponent implements Serializable {
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("opponent")
    @Expose
    private Opponent_ opponent;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Opponent_ getOpponent() {
        return opponent;
    }

    public void setOpponent(Opponent_ opponent) {
        this.opponent = opponent;
    }
}
