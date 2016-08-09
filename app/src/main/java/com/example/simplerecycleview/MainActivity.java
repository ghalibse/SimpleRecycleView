package com.example.simplerecycleview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private RecyclerView mRecyclerView;

    private ArrayList<String> mStrings;

    private LibuAdapter mLibuAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mStrings = new ArrayList<>();
        mStrings.add("Edwin");
        mStrings.add("Liub");
        mStrings.add("Chris");
        mStrings.add("Aldo");
        mStrings.add("Mike");

        mLibuAdapter = new LibuAdapter(mStrings);

        mRecyclerView = (RecyclerView) findViewById( R.id.a_main_recycler);
        mRecyclerView.setAdapter(mLibuAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}
