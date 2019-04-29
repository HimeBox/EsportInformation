package MatchList;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class Match implements Serializable {
    @SerializedName("winner_id")
    @Expose
    private Object winnerId;
    @SerializedName("winner")
    @Expose
    private Object winner;
    @SerializedName("videogame_version")
    @Expose
    private Object videogameVersion;
    @SerializedName("videogame")
    @Expose
    private Videogame videogame;
    @SerializedName("tournament_id")
    @Expose
    private Integer tournamentId;
    @SerializedName("tournament")
    @Expose
    private Tournament tournament;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("slug")
    @Expose
    private String slug;
    @SerializedName("serie_id")
    @Expose
    private Integer serieId;
    @SerializedName("serie")
    @Expose
    private Serie serie;
    @SerializedName("results")
    @Expose
    private List<Result> results = null;
    @SerializedName("opponents")
    @Expose
    private List<Opponent> opponents = null;
    @SerializedName("number_of_games")
    @Expose
    private Integer numberOfGames;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("modified_at")
    @Expose
    private String modifiedAt;
    @SerializedName("match_type")
    @Expose
    private String matchType;
    @SerializedName("live")
    @Expose
    private Live live;
    @SerializedName("league_id")
    @Expose
    private Integer leagueId;
    @SerializedName("league")
    @Expose
    private League league;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("games")
    @Expose
    private List<Game> games = null;
    @SerializedName("draw")
    @Expose
    private Boolean draw;
    @SerializedName("begin_at")
    @Expose
    private String beginAt;

    public Object getWinnerId() {
        return winnerId;
    }

    public void setWinnerId(Object winnerId) {
        this.winnerId = winnerId;
    }

    public Object getWinner() {
        return winner;
    }

    public void setWinner(Object winner) {
        this.winner = winner;
    }

    public Object getVideogameVersion() {
        return videogameVersion;
    }

    public void setVideogameVersion(Object videogameVersion) {
        this.videogameVersion = videogameVersion;
    }

    public Videogame getVideogame() {
        return videogame;
    }

    public void setVideogame(Videogame videogame) {
        this.videogame = videogame;
    }

    public Integer getTournamentId() {
        return tournamentId;
    }

    public void setTournamentId(Integer tournamentId) {
        this.tournamentId = tournamentId;
    }

    public Tournament getTournament() {
        return tournament;
    }

    public void setTournament(Tournament tournament) {
        this.tournament = tournament;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    public List<Result> getResults() {
        return results;
    }

    public void setResults(List<Result> results) {
        this.results = results;
    }

    public List<Opponent> getOpponents() {
        return opponents;
    }

    public void setOpponents(List<Opponent> opponents) {
        this.opponents = opponents;
    }

    public Integer getNumberOfGames() {
        return numberOfGames;
    }

    public void setNumberOfGames(Integer numberOfGames) {
        this.numberOfGames = numberOfGames;
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

    public String getMatchType() {
        return matchType;
    }

    public void setMatchType(String matchType) {
        this.matchType = matchType;
    }

    public Live getLive() {
        return live;
    }

    public void setLive(Live live) {
        this.live = live;
    }

    public Integer getLeagueId() {
        return leagueId;
    }

    public void setLeagueId(Integer leagueId) {
        this.leagueId = leagueId;
    }

    public League getLeague() {
        return league;
    }

    public void setLeague(League league) {
        this.league = league;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Game> getGames() {
        return games;
    }

    public void setGames(List<Game> games) {
        this.games = games;
    }

    public Boolean getDraw() {
        return draw;
    }

    public void setDraw(Boolean draw) {
        this.draw = draw;
    }

    public String getBeginAt() {
        return beginAt;
    }

    public void setBeginAt(String beginAt) {
        this.beginAt = beginAt;
    }

}
