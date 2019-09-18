package com.example.meetingvotesystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Spinner;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SetVoteActivity extends AppCompatActivity {
    Spinner sp1;
    int i = 3;
    ImageView btadd, btminus;
    ListView listview;
    ArrayAdapter<String> adapter;
    private static String[] str = {"单选", "多选"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_vote);
        btadd = findViewById(R.id.img_add);
        //下拉列表Spinner设置
        sp1 = findViewById(R.id.spinner1);
        adapter = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, str);
        sp1.setAdapter(adapter);
        sp1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                adapterView.setVisibility(View.VISIBLE);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        //ListView设置

        final ArrayList<HashMap<String, Object>> users = new ArrayList<HashMap<String, Object>>();
        btadd.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View view) {
                Toast.makeText(SetVoteActivity.this, "dian", Toast.LENGTH_SHORT).show();
                HashMap<String, Object> user = new HashMap<String, Object>();
                user.put("chooses", "选项" + (i++));
                users.add(user);

                listview = findViewById(R.id.listview1);
                SimpleAdapter ImageItem = new SimpleAdapter(SetVoteActivity.this,users,R.layout.item1,new String[]{"chooses"},
                        new int[]{R.id.item_ed_1});
                //为listView设置适配
                listview.setAdapter(ImageItem);
            }
        });

    }


}

