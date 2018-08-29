package com.example.choi.listviewtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList data = new ArrayList();

        data.add(new Weather("수원", "25도", "맑음"));
        data.add(new Weather("서울", "23도", "비"));
        data.add(new Weather("안양", "24도", "구름"));
        data.add(new Weather("부산", "21도", "맑음"));
        data.add(new Weather("용인", "26도", "비"));

        MyAdapter adapter = new MyAdapter(data);
        ListView listView = (ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);

    }
}
