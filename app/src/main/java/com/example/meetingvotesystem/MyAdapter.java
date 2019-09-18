package com.example.meetingvotesystem;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.TextView;

import com.example.meetingvotesystem.R;

import java.util.List;

public class MyAdapter extends ArrayAdapter<String> {
    public MyAdapter(Context context, int tvSourceId, List<String> objects) {
        super(context, tvSourceId,objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view;
        if(convertView==null){
            view= LayoutInflater.from(getContext()).inflate(R.layout.item1,null);
        }
        else{
            view=convertView;
        }
        EditText edt =  view.findViewById(R.id.item_ed_1);
        edt.setText(getItem(position));
        return view;
    }
}