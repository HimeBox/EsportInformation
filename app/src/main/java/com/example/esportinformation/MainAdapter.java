package com.example.esportinformation;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import GameDetail.MatchActivity;

import static com.example.esportinformation.MainActivity.DETAIL_MESSAGE;


// Adapter made by my self to add unit to ListView
public class MainAdapter extends BaseAdapter implements ListAdapter {
    private List<String> list = new ArrayList<String>();
    private List<Integer> id_list = new ArrayList<Integer>();
    private Context context;


    public MainAdapter(List<String> list,List<Integer> id_list, Context context) {
        this.list = list;
        this.id_list = id_list;
        this.context = context;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int pos) {
        return list.get(pos);
    }

    @Override
    public long getItemId(int pos) {
        return 0;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if (view == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.main_adapter, null);
        }

        // Handle TextView and display string from your list
        TextView listItemText = (TextView)view.findViewById(R.id.list_item_string);
        listItemText.setText(list.get(position));

        // Handle buttons and add onClickListeners
        Button linkBtn = (Button)view.findViewById(R.id.link_btn);

        linkBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, MatchActivity.class);
                String match_id = id_list.get(position).toString();
                intent.putExtra(DETAIL_MESSAGE, match_id);
                context.startActivity(intent);
            }
        });

        return view;
    }
}
