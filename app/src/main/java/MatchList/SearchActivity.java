package MatchList;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ListView;

import com.example.esportinformation.MainActivity;
import com.example.esportinformation.PandaApi;
import com.example.esportinformation.R;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class SearchActivity extends AppCompatActivity implements Serializable {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Intent intent = getIntent();
        String query = intent.getStringExtra(MainActivity.SEARCH_MESSAGE);
        String content = intent.getStringExtra(MainActivity.SEARCH_CONTENT);
        String filter = intent.getStringExtra(MainActivity.SEARCH_FILTER);

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
        Call<List<Match>> call;
        if(filter.equals("All")){
            if(content.equals("Name")){
                call = pandaApi.searchNameAll(query,token);
            }
            else if(content.equals("Id")){
                call = pandaApi.searchIdAll(query,token);
            }
            else{
                call = pandaApi.searchTimeAll(query,token);
            }
        }
        else if(filter.equals("Upcoming")){
            if(content.equals("Name")){
                call = pandaApi.searchNameStatus(query,"not_started",token);
            }
            else if(content.equals("Id")){
                call = pandaApi.searchIdStatus(query,"not_started",token);
            }
            else{
                call = pandaApi.searchTimeStatus(query,"not_started",token);
            }
        }
        else{
            if(content.equals("Name")){
                call = pandaApi.searchNameStatus(query,"finished",token);
            }
            else if(content.equals("Id")){
                call = pandaApi.searchIdStatus(query,"finished",token);
            }
            else{
                call = pandaApi.searchTimeStatus(query,"finished",token);
            }
        }
        call.enqueue(new Callback<List<Match>>() {
            // We use implemented enqueue function to avoid multiple calls caused by serval activities.
            // However at that moment the app itself only have 1 activity.
            @Override
            public void onResponse(Call<List<Match>> call, Response<List<Match>> response) {
                // Detect if a code error appears instead of actual response. For example, code 404.
                if(!response.isSuccessful()){
                    return;
                }
                // Grab data from object created by Retrofit.
                List<Match> matches = response.body();
                List<String> mList = new ArrayList<>();
                int c = 0;
                for(Match match : matches){
                    String context = "";
                    context += match.getName() + "\n";
                    List<Result> results = match.getResults();
                    if(results.size() == 2 && match.getStatus() == "finished"){
                        context += results.get(0).getScore() + " : " + results.get(1).getScore() + "\n";
                    }
                    else{
                        context += "Not Started\n";
                    }
                    context += match.getTournament().getSlug() + "\n";
                    context += match.getTournament().getName() + "\n";
                    context += match.getBeginAt();
                    mList.add(context);
                    c += 1;
                    if(c > 30){
                        break;
                    }
                }
                // In order to use findViewById in fragment, the view return by onCreateView is needed
                ListView mainList = findViewById(R.id.search_list);

                mainList.setAdapter(new SearchAdapter(mList,matches,SearchActivity.this));
            }
            // If something went wrong, display it on the screen.
            @Override
            public void onFailure(Call<List<Match>> call, Throwable t) {

            }
        });

    }

}
