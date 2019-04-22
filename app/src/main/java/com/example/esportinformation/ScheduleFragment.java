package com.example.esportinformation;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ScheduleFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.schedule_fragment,null);
        setText(view);
        return view;
    }

    public void setText(View view){
        final MatchStorage matchStorage = new MatchStorage(new ArrayList<Match>(), new ArrayList<Integer>(), getContext());
        matchStorage.read();
        List<Match> matches = matchStorage.getMatchList();
        final List<String> mList = new ArrayList<>();
        List<Integer> idList = new ArrayList<>();
        int c = 0;
        for(Match match : matches){
            String context = "";
            context += match.getName() + "\n";
            context += match.getResults().get(0).getScore() + " : " + match.getResults().get(1).getScore() + "\n";
            context += match.getTournament().getSlug() + "\n";
            context += match.getTournament().getName() + "\n";
            context += match.getBeginAt() + "\n";
            context += match.getStatus();
            mList.add(context);
            idList.add(match.getId());
            c += 1;
            if(c > 30){
                break;
            }
        }
        // In order to use findViewById in fragment, the view return by onCreateView is needed
        ListView mainList = view.findViewById(R.id.schedule_list);
        final ScheduleAdapter adapter = new ScheduleAdapter(mList,matchStorage, getContext());
        mainList.setAdapter(adapter);
        mainList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> a, View v, int position, long id) {
                AlertDialog.Builder adb=new AlertDialog.Builder(getContext());
                adb.setTitle("Delete?");
                adb.setMessage("Are you sure you want to delete " + position);
                final int positionToRemove = position;
                adb.setNegativeButton("Cancel", null);
                adb.setPositiveButton("Ok", new AlertDialog.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        mList.remove(positionToRemove);
                        adapter.notifyDataSetChanged();
                    }});
                adb.show();
            }
        });

    }


}

