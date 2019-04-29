package GameDetail;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Opponent_ implements Serializable {
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("opponent")
    @Expose
    private Opponent__ opponent;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Opponent__ getOpponent() {
        return opponent;
    }

    public void setOpponent(Opponent__ opponent) {
        this.opponent = opponent;
    }
}
