package com.example.esportinformation;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class SearchFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.search_fragment,null);
        setText(view);
        return view;
    }
    public void setText(View view){
        // Hardcoded to show example content
        List<String> mList = new ArrayList<>();
        // In order to use findViewById in fragment, the view return by onCreateView is needed
        ListView mainList = view.findViewById(R.id.search_list);
        for(int i = 0;i < 10;i++){
            String context = "";
            context += "Team A vs Team B \n";
            context += "16 : 9 \n";
            context += "XX Minor \n";
            context += "05/xx/2019 17:00";
            mList.add(context);
        }
        mainList.setAdapter(new MainAdapter(mList,getContext()));
    }
}
