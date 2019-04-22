package com.example.esportinformation;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.DELETE;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface PandaApi {
    @GET("/csgo/matches/past")
    Call<List<Match>> getRunningMatch(@Query("token") String token);

    @GET("/csgo/matches/upcoming")
    Call<List<Match>> getUpcomingMatch(@Query("token") String token);

    @GET("/csgo/matches")
    Call<List<Match>> searchName(
            @Query("search[name]") String query,
            @Query("token") String token
    );

    @GET("/csgo/matches/{match_id}/games")
    Call<List<Game>> getGames(
            @Path("match_id") String match_id,
            @Query("token") String token
    );
}
