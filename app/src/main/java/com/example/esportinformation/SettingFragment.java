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

public class SettingFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.setting_fragment,null);
        setText(view);
        return view;
    }
    public void setText(View view){
        // Hardcoded to show example content
        List<String> mList = new ArrayList<>();
        // In order to use findViewById in fragment, the view return by onCreateView is needed
        ListView mainList = view.findViewById(R.id.setting_list);
        String contextA = "";
        contextA += "Quit";
        mList.add(contextA);
        mainList.setAdapter(new SettingAdapter(mList,this.getActivity()));
    }
}
