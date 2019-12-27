package com.example.viewpager2demo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ViewPager2 viewPager2 = findViewById(R.id.view_pager);

        List<MyData> data = new ArrayList<>();

            data.add(new MyData(String.valueOf(0),"#00ff00"));
            data.add(new MyData(String.valueOf(1),"#ff0000"));
            data.add(new MyData(String.valueOf(2),"#0000ff"));
            data.add(new MyData(String.valueOf(3),"#0f0f0f"));

        MyAdapter adapter = new MyAdapter(data);

        viewPager2.setAdapter(adapter);
    }
}
