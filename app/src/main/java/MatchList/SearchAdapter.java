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
public class SearchAdapter extends BaseAdapter implements ListAdapter {
    private List<String> list = new ArrayList<String>();
    private List<Match> match_list = new ArrayList<>();
    private Context context;
    private List<Match> old_list;

    public SearchAdapter(List<String> list, List<Match> match_list, Context context) {
        this.list = list;
        this.match_list = match_list;
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
            view = inflater.inflate(R.layout.search_adapter, null);
        }

        // Handle TextView and display string from your list
        TextView listItemText = (TextView)view.findViewById(R.id.list_item_string);
        listItemText.setText(list.get(position));

        // Handle buttons and add onClickListeners
        Button linkBtn = (Button)view.findViewById(R.id.link_btn);

        linkBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                MatchStorage matchStorage = new MatchStorage(new ArrayList<Match>(), new ArrayList<Integer>(), context);
                matchStorage.read();
                if(matchStorage.addItem(match_list.get(position),match_list.get(position).getId())){
                    matchStorage.save();
                    Toast.makeText(context,"Match added and saved!",Toast.LENGTH_LONG).show();
                }
            }
        });

        return view;
    }
}
