package GameDetail;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class Game implements Serializable {
    @SerializedName("winner_type")
    @Expose
    private String winnerType;
    @SerializedName("winner")
    @Expose
    private Winner winner;
    @SerializedName("teams")
    @Expose
    private List<Team> teams = null;
    @SerializedName("rounds")
    @Expose
    private List<Round> rounds = null;
    @SerializedName("position")
    @Expose
    private Integer position;
    @SerializedName("players")
    @Expose
    private List<Player> players = null;
    @SerializedName("match_id")
    @Expose
    private Integer matchId;
    @SerializedName("match")
    @Expose
    private Match match;
    @SerializedName("map")
    @Expose
    private Map map;
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

    public List<Team> getTeams() {
        return teams;
    }

    public void setTeams(List<Team> teams) {
        this.teams = teams;
    }

    public List<Round> getRounds() {
        return rounds;
    }

    public void setRounds(List<Round> rounds) {
        this.rounds = rounds;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public Integer getMatchId() {
        return matchId;
    }

    public void setMatchId(Integer matchId) {
        this.matchId = matchId;
    }

    public Match getMatch() {
        return match;
    }

    public void setMatch(Match match) {
        this.match = match;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
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
