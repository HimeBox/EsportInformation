package MatchList;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.SearchView;
import android.widget.TextView;

import com.example.esportinformation.MainActivity;
import com.example.esportinformation.R;

import GameDetail.MatchActivity;
import MatchList.SearchActivity;

import static com.example.esportinformation.MainActivity.DETAIL_MESSAGE;
import static com.example.esportinformation.MainActivity.SEARCH_CONTENT;
import static com.example.esportinformation.MainActivity.SEARCH_FILTER;
import static com.example.esportinformation.MainActivity.SEARCH_MESSAGE;

public class SearchFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.search_fragment,null);
        final SearchView searchView = view.findViewById(R.id.search_bar);
        final TextView content = view.findViewById(R.id.content_status);
        final TextView filter = view.findViewById(R.id.filter_status);

        Button nameBtn = (Button)view.findViewById(R.id.name_btn);
        nameBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                content.setText("Name");
                setListener(searchView,content.getText().toString(),filter.getText().toString());
            }
        });

        Button idBtn = (Button)view.findViewById(R.id.id_btn);
        idBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                content.setText("Id");
                setListener(searchView,content.getText().toString(),filter.getText().toString());
            }
        });
        Button timeBtn = (Button)view.findViewById(R.id.time_btn);
        timeBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                content.setText("Time");
                setListener(searchView,content.getText().toString(),filter.getText().toString());
            }
        });
        Button allBtn = (Button)view.findViewById(R.id.all_btn);
        allBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                filter.setText("All");
                setListener(searchView,content.getText().toString(),filter.getText().toString());
            }
        });
        Button upcomingBtn = (Button)view.findViewById(R.id.upcoming_btn);
        upcomingBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                filter.setText("Upcoming");
                setListener(searchView,content.getText().toString(),filter.getText().toString());
            }
        });
        Button pastBtn = (Button)view.findViewById(R.id.past_btn);
        pastBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                filter.setText("Past");
                setListener(searchView,content.getText().toString(),filter.getText().toString());
            }
        });

        setListener(searchView,content.getText().toString(),filter.getText().toString());
        return view;
    }

    public void setListener(SearchView searchView, final String content, final String filter){
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                Intent intent = new Intent(getContext(), SearchActivity.class);
                intent.putExtra(SEARCH_MESSAGE, query);
                intent.putExtra(SEARCH_CONTENT, content);
                intent.putExtra(SEARCH_FILTER, filter);
                getContext().startActivity(intent);
                return true;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                return false;
            }
        });
    }
}
