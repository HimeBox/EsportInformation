package MatchList;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Tournament implements Serializable {
    @SerializedName("winner_type")
    @Expose
    private String winnerType;
    @SerializedName("winner_id")
    @Expose
    private Object winnerId;
    @SerializedName("slug")
    @Expose
    private String slug;
    @SerializedName("serie_id")
    @Expose
    private Integer serieId;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("modified_at")
    @Expose
    private String modifiedAt;
    @SerializedName("league_id")
    @Expose
    private Integer leagueId;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("end_at")
    @Expose
    private String endAt;
    @SerializedName("begin_at")
    @Expose
    private String beginAt;

    public String getWinnerType() {
        return winnerType;
    }

    public void setWinnerType(String winnerType) {
        this.winnerType = winnerType;
    }

    public Object getWinnerId() {
        return winnerId;
    }

    public void setWinnerId(Object winnerId) {
        this.winnerId = winnerId;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public Integer getSerieId() {
        return serieId;
    }

    public void setSerieId(Integer serieId) {
        this.serieId = serieId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(String modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    public Integer getLeagueId() {
        return leagueId;
    }

    public void setLeagueId(Integer leagueId) {
        this.leagueId = leagueId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEndAt() {
        return endAt;
    }

    public void setEndAt(String endAt) {
        this.endAt = endAt;
    }

    public String getBeginAt() {
        return beginAt;
    }

    public void setBeginAt(String beginAt) {
        this.beginAt = beginAt;
    }
}
