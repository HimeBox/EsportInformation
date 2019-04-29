package com.example.esportinformation;

import java.util.List;

import GameDetail.Game;
import MatchList.Match;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface PandaApi {
    @GET("/csgo/matches/past")
    Call<List<Match>> getRunningMatch(@Query("token") String token);

    @GET("/csgo/matches/upcoming")
    Call<List<Match>> getUpcomingMatch(@Query("token") String token);

    @GET("/csgo/matches")
    Call<List<Match>> searchNameAll(
            @Query("search[name]") String query,
            @Query("token") String token
    );

    @GET("/csgo/matches")
    Call<List<Match>> searchIdAll(
            @Query("filter[id]") String query,
            @Query("token") String token
    );


    @GET("/csgo/matches")
    Call<List<Match>> searchTimeAll(
            @Query("filter[begin_at]") String query,
            @Query("token") String token
    );

    @GET("/csgo/matches")
    Call<List<Match>> searchNameStatus(
            @Query("search[name]") String query,
            @Query("filter[status]") String status,
            @Query("token") String token
    );

    @GET("/csgo/matches")
    Call<List<Match>> searchIdStatus(
            @Query("filter[id]") String query,
            @Query("filter[status]") String status,
            @Query("token") String token
    );


    @GET("/csgo/matches")
    Call<List<Match>> searchTimeStatus(
            @Query("filter[begin_at]") String query,
            @Query("filter[status]") String status,
            @Query("token") String token
    );


    @GET("/csgo/matches/{match_id}/games")
    Call<List<Game>> getGames(
            @Path("match_id") String match_id,
            @Query("token") String token
    );
}
