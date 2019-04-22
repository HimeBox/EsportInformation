package com.example.esportinformation;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Opponent implements Serializable {
    @SerializedName("opponent")
    @Expose
    private Opponent_ opponent;
    @SerializedName("type")
    @Expose
    private String type;

    public Opponent_ getOpponent() {
        return opponent;
    }

    public void setOpponent(Opponent_ opponent) {
        this.opponent = opponent;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
