package com.example.esportinformation;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.koushikdutta.ion.Ion;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MatchActivity extends AppCompatActivity {

    Timer timer=new Timer();//Used for a delay to provide user feedback
    Handler handler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_match);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Intent intent = getIntent();
        String match_id = intent.getStringExtra(MainActivity.DETAIL_MESSAGE);

        String token = "eTo2CCMVy4iacpdyTP8Kj6xacgUGDMW9F1x-c--cR9U6bZtd-Ow";
        Gson gson = new GsonBuilder()
                .setDateFormat("yyyy-MM-dd'T'HH:mm:ssZ")
                .create();

        OkHttpClient.Builder okhttpClientBuilder = new OkHttpClient.Builder();

        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);
        okhttpClientBuilder.addInterceptor(logging);

        // Build retrofit object
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.pandascore.co")
                .addConverterFactory(GsonConverterFactory.create(gson))
                .client(okhttpClientBuilder.build())
                .build();

        PandaApi pandaApi = retrofit.create(PandaApi.class);

        Call<List<Game>> call = pandaApi.getGames(match_id,token); // Add user here!
        call.enqueue(new Callback<List<Game>>() {
            @Override
            public void onResponse(Call<List<Game>> call, Response<List<Game>> response) {
                // Grab data from object created by Retrofit.
                List<Game> games = response.body();
                setup(games);
            }
            // If something went wrong, display it on the screen.
            @Override
            public void onFailure(Call<List<Game>> call, Throwable t) {

            }
        });


    }

    public void setup(List<Game> games){
        // For map data
        String map_info = "Maps:";
        // For player's stats
        String player1_stat = "";
        String player2_stat = "";
        String player3_stat = "";
        String player4_stat = "";
        String player5_stat = "";
        String player6_stat = "";
        String player7_stat = "";
        String player8_stat = "";
        String player9_stat = "";
        String player10_stat = "";

        // For team1 info
        Integer team1_id = games.get(0).getTeams().get(0).getId();
        String team1_name = games.get(0).getTeams().get(0).getName();
        TextView team_name1 = findViewById(R.id.team_name1);
        team_name1.setText(team1_name);
        timer.schedule(new SmallDelay(), 100);
        ImageView team_image1 = findViewById(R.id.team_image1);
        Ion.with(team_image1).load(games.get(0).getTeams().get(0).getImageUrl());


        // For team2 info
        Integer team2_id = games.get(0).getTeams().get(1).getId();
        String team2_name = games.get(0).getTeams().get(1).getName();
        TextView team_name2 = findViewById(R.id.team_name2);
        team_name2.setText(team2_name);
        ImageView team_image2 = findViewById(R.id.team_image2);
        Ion.with(team_image2).load(games.get(0).getTeams().get(1).getImageUrl());

        // Assign players to each team
        List<Player> players = games.get(0).getPlayers();
        List<Player> team1_player = new ArrayList<>();
        List<Player> team2_player = new ArrayList<>();
        for(Player player : players){
            if(player.getTeam().getId() == team1_id){
                team1_player.add(player);
            }
            else{
                team2_player.add(player);
            }
        }
        // Set player to position on content according to their id
        Integer player1_id = team1_player.get(0).getPlayer().getId();
        TextView player1_name = findViewById(R.id.player1_name);
        ImageView player1_image = findViewById(R.id.player1_image);
        player1_name.setText(team1_player.get(0).getPlayer().getName());
        Ion.with(player1_image).load(team1_player.get(0).getPlayer().getImageUrl());

        Integer player2_id = team1_player.get(1).getPlayer().getId();
        TextView player2_name = findViewById(R.id.player2_name);
        ImageView player2_image = findViewById(R.id.player2_image);
        player2_name.setText(team1_player.get(1).getPlayer().getName());
        Ion.with(player2_image).load(team1_player.get(1).getPlayer().getImageUrl());

        Integer player3_id = team1_player.get(2).getPlayer().getId();
        TextView player3_name = findViewById(R.id.player3_name);
        ImageView player3_image = findViewById(R.id.player3_image);
        player3_name.setText(team1_player.get(2).getPlayer().getName());
        Ion.with(player3_image).load(team1_player.get(2).getPlayer().getImageUrl());

        Integer player4_id = team1_player.get(3).getPlayer().getId();
        TextView player4_name = findViewById(R.id.player4_name);
        ImageView player4_image = findViewById(R.id.player4_image);
        player4_name.setText(team1_player.get(3).getPlayer().getName());
        Ion.with(player4_image).load(team1_player.get(3).getPlayer().getImageUrl());

        Integer player5_id = team1_player.get(4).getPlayer().getId();
        TextView player5_name = findViewById(R.id.player5_name);
        ImageView player5_image = findViewById(R.id.player5_image);
        player5_name.setText(team1_player.get(4).getPlayer().getName());
        Ion.with(player5_image).load(team1_player.get(4).getPlayer().getImageUrl());

        Integer player6_id = team2_player.get(0).getPlayer().getId();
        TextView player6_name = findViewById(R.id.player6_name);
        ImageView player6_image = findViewById(R.id.player6_image);
        player6_name.setText(team2_player.get(0).getPlayer().getName());
        Ion.with(player6_image).load(team2_player.get(0).getPlayer().getImageUrl());

        Integer player7_id = team2_player.get(1).getPlayer().getId();
        TextView player7_name = findViewById(R.id.player7_name);
        ImageView player7_image = findViewById(R.id.player7_image);
        player7_name.setText(team2_player.get(1).getPlayer().getName());
        Ion.with(player7_image).load(team2_player.get(1).getPlayer().getImageUrl());

        Integer player8_id = team2_player.get(2).getPlayer().getId();
        TextView player8_name = findViewById(R.id.player8_name);
        ImageView player8_image = findViewById(R.id.player8_image);
        player8_name.setText(team2_player.get(2).getPlayer().getName());
        Ion.with(player8_image).load(team2_player.get(2).getPlayer().getImageUrl());

        Integer player9_id = team2_player.get(3).getPlayer().getId();
        TextView player9_name = findViewById(R.id.player9_name);
        ImageView player9_image = findViewById(R.id.player9_image);
        player9_name.setText(team2_player.get(3).getPlayer().getName());
        Ion.with(player9_image).load(team2_player.get(3).getPlayer().getImageUrl());

        Integer player10_id = team2_player.get(4).getPlayer().getId();
        TextView player10_name = findViewById(R.id.player10_name);
        ImageView player10_image = findViewById(R.id.player10_image);
        player10_name.setText(team2_player.get(4).getPlayer().getName());
        Ion.with(player10_image).load(team2_player.get(4).getPlayer().getImageUrl());

        // Loop through games to get map and stat
        Integer counter = 1;
        for(Game game : games){
            map_info += "\nG" + counter + " " + game.getMap();
            List<Player> players_ = game.getPlayers();
            for(Player player : players_){
                if(player.getPlayer().getId() == player1_id){
                    player1_stat += "G" + counter + " " + player.getKills() + "/" + player.getAssists() + "/" + player.getDeaths() + " ADR:" + player.getAdr() + " Rating:" + player.getRating() + "\n";
                }
                else if(player.getPlayer().getId() == player2_id){
                    player2_stat += "G" + counter + " " + player.getKills() + "/" + player.getAssists() + "/" + player.getDeaths() + " ADR:" + player.getAdr() + " Rating:" + player.getRating() + "\n";
                }
                else if(player.getPlayer().getId() == player3_id){
                    player3_stat += "G" + counter + " " + player.getKills() + "/" + player.getAssists() + "/" + player.getDeaths() + " ADR:" + player.getAdr() + " Rating:" + player.getRating() + "\n";
                }
                else if(player.getPlayer().getId() == player4_id){
                    player4_stat += "G" + counter + " " + player.getKills() + "/" + player.getAssists() + "/" + player.getDeaths() + " ADR:" + player.getAdr() + " Rating:" + player.getRating() + "\n";
                }
                else if(player.getPlayer().getId() == player5_id){
                    player5_stat += "G" + counter + " " + player.getKills() + "/" + player.getAssists() + "/" + player.getDeaths() + " ADR:" + player.getAdr() + " Rating:" + player.getRating() + "\n";
                }
                else if(player.getPlayer().getId() == player6_id){
                    player6_stat += "G" + counter + " " + player.getKills() + "/" + player.getAssists() + "/" + player.getDeaths() + " ADR:" + player.getAdr() + " Rating:" + player.getRating() + "\n";
                }
                else if(player.getPlayer().getId() == player7_id){
                    player7_stat += "G" + counter + " " + player.getKills() + "/" + player.getAssists() + "/" + player.getDeaths() + " ADR:" + player.getAdr() + " Rating:" + player.getRating() + "\n";
                }
                else if(player.getPlayer().getId() == player8_id){
                    player8_stat += "G" + counter + " " + player.getKills() + "/" + player.getAssists() + "/" + player.getDeaths() + " ADR:" + player.getAdr() + " Rating:" + player.getRating() + "\n";
                }
                else if(player.getPlayer().getId() == player9_id){
                    player9_stat += "G" + counter + " " + player.getKills() + "/" + player.getAssists() + "/" + player.getDeaths() + " ADR:" + player.getAdr() + " Rating:" + player.getRating() + "\n";
                }
                else{
                    player10_stat += "G" + counter + " " + player.getKills() + "/" + player.getAssists() + "/" + player.getDeaths() + " ADR:" + player.getAdr() + " Rating:" + player.getRating() + "\n";
                }
            }
            counter += 1;
        }
        // Set map
        TextView map_text = findViewById(R.id.map_detail);
        map_text.setText(map_info);
        // Set player stats
        TextView player1_info = findViewById(R.id.player1_stat);
        player1_info.setText(player1_stat);

        TextView player2_info = findViewById(R.id.player2_stat);
        player2_info.setText(player2_stat);

        TextView player3_info = findViewById(R.id.player3_stat);
        player3_info.setText(player3_stat);

        TextView player4_info = findViewById(R.id.player4_stat);
        player4_info.setText(player4_stat);

        TextView player5_info = findViewById(R.id.player5_stat);
        player5_info.setText(player5_stat);

        TextView player6_info = findViewById(R.id.player6_stat);
        player6_info.setText(player6_stat);

        TextView player7_info = findViewById(R.id.player7_stat);
        player7_info.setText(player7_stat);

        TextView player8_info = findViewById(R.id.player8_stat);
        player8_info.setText(player8_stat);

        TextView player9_info = findViewById(R.id.player9_stat);
        player9_info.setText(player9_stat);

        TextView player10_info = findViewById(R.id.player10_stat);
        player10_info.setText(player10_stat);
    }

    class SmallDelay extends TimerTask {
        public void run() {
            handler.sendEmptyMessage(0);
        }
    }
}
