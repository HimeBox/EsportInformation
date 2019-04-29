package MatchList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.TextView;
import android.widget.Toast;

import com.example.esportinformation.R;

import java.util.ArrayList;
import java.util.List;



// Adapter made by my self to add unit to ListView
public class ScheduleAdapter extends BaseAdapter implements ListAdapter {
    private List<String> list = new ArrayList<String>();
    private Context context;
    LayoutInflater inflater;



    public ScheduleAdapter(List<String> list, Context context) {
        this.list = list;
        this.context = context;
        this.inflater = LayoutInflater.from(context);
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
    public View getView(final int position, final View convertView, ViewGroup parent) {
        View view = convertView;
        if (view == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.schedule_adapter, null);
        }

        // Handle TextView and display string from your list
        TextView listItemText = (TextView)view.findViewById(R.id.schedule_list_string);
        listItemText.setText(list.get(position));

        // Handle buttons and add onClickListeners
        Button linkBtn = (Button)view.findViewById(R.id.schedule_link_btn);

        linkBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                MatchStorage matchStorage = new MatchStorage(new ArrayList<Match>(), new ArrayList<Integer>(), context);
                matchStorage.read();
                matchStorage.deleteItem(position);
                matchStorage.save();
                Toast.makeText(context,"Match deleted! Reload page to see.",Toast.LENGTH_LONG).show();
            }
        });

        return view;
    }
}
