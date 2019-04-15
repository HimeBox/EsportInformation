package com.example.esportinformation;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.google.firebase.FirebaseApp;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class SearchFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.search_fragment,null);
        setText(view);
        return view;
    }
    public void setText(final View view){
        String token = "eTo2CCMVy4iacpdyTP8Kj6xacgUGDMW9F1x-c--cR9U6bZtd-Ow";
        Gson gson = new GsonBuilder()
                .setDateFormat("yyyy-MM-dd'T'HH:mm:ssZ")
                .create();

        // Build retrofit object
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.pandascore.co")
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

        PandaApi pandaApi = retrofit.create(PandaApi.class);

        Call<List<Match>> call = pandaApi.getUpcomingMatch(token); // Add user here!
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
                List<Integer> idList = new ArrayList<>();
                List<Match> match_list = new ArrayList<>();
                int c = 0;
                for(Match match : matches){
                    String context = "";
                    context += match.getName() + "\n";
                    context += "Time : " + match.getBeginAt() + "\n";
                    context += match.getTournament().getSlug() + "\n";
                    context += match.getTournament().getName();
                    mList.add(context);
                    idList.add(match.getId());
                    match_list.add(match);
                    c += 1;
                    if(c > 20){
                        break;
                    }
                }
                // In order to use findViewById in fragment, the view return by onCreateView is needed
                ListView mainList = view.findViewById(R.id.search_list);
                mainList.setAdapter(new SearchAdapter(mList,match_list,getContext()));
            }
            // If something went wrong, display it on the screen.
            @Override
            public void onFailure(Call<List<Match>> call, Throwable t) {

            }
        });
    }
}
