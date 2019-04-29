package GameDetail;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Serie implements Serializable {
    @SerializedName("year")
    @Expose
    private Integer year;
    @SerializedName("winner_type")
    @Expose
    private String winnerType;
    @SerializedName("winner_id")
    @Expose
    private Object winnerId;
    @SerializedName("slug")
    @Expose
    private String slug;
    @SerializedName("season")
    @Expose
    private String season;
    @SerializedName("prizepool")
    @Expose
    private String prizepool;
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
    @SerializedName("full_name")
    @Expose
    private String fullName;
    @SerializedName("end_at")
    @Expose
    private Object endAt;
    @SerializedName("description")
    @Expose
    private Object description;
    @SerializedName("begin_at")
    @Expose
    private String beginAt;

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

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

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public String getPrizepool() {
        return prizepool;
    }

    public void setPrizepool(String prizepool) {
        this.prizepool = prizepool;
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

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Object getEndAt() {
        return endAt;
    }

    public void setEndAt(Object endAt) {
        this.endAt = endAt;
    }

    public Object getDescription() {
        return description;
    }

    public void setDescription(Object description) {
        this.description = description;
    }

    public String getBeginAt() {
        return beginAt;
    }

    public void setBeginAt(String beginAt) {
        this.beginAt = beginAt;
    }
}
