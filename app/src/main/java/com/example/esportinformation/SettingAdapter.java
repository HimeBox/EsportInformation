package com.example.esportinformation;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import static android.support.v4.app.ActivityCompat.finishAffinity;
import static com.example.esportinformation.MainActivity.DETAIL_MESSAGE;


// Adapter made by my self to add unit to ListView
public class SettingAdapter extends BaseAdapter implements ListAdapter {
    private List<String> list = new ArrayList<String>();
    private Context context;
    public String fileName = "schedule_list.txt";


    public SettingAdapter(List<String> list, Context context) {
        this.list = list;
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
                if(position == 0){
                    finishAffinity((Activity)context);
                    System.exit(0);
                }
                else{
                    context.deleteFile(fileName);
                    Toast.makeText(context,"Internal storage deleted!",Toast.LENGTH_LONG).show();
                }

            }
        });

        return view;
    }
}
