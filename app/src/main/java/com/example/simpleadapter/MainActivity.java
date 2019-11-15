package com.example.simpleadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView  listView = findViewById(R.id.listView);
        List<Map<String,?>> datalist = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            Map<String ,String> map = new HashMap<>();
            map.put("name","张三"+i);
            map.put("sex",i%2 ==0? "男":"女");
            map.put("age",10+i+"");
            datalist.add(map);
        }
        String[] from = {"name","sex","age"};
        int[] to = {R.id.tv_name,R.id.tv_sex,R.id.tv_age};


        SimpleAdapter simpleAdapter = new SimpleAdapter(this,datalist,R.layout.item_userinfo,from,to);
        listView.setAdapter(simpleAdapter);
    }
}
