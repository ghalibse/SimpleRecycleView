package com.example.simplerecycleview;

import android.graphics.Color;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {


    private RecyclerView mRecyclerView;

    private ArrayList<String> mStrings;

    private LibuAdapter mLibuAdapter;

    String[] names = new String[]
            {"Darwin", "Amada", "Tiffanie", "Eladia", "Zoila", "Shanika",
                    "Cassondra", "Lani", "Brandee", "Diego", "Danika", "Deangelo",
                    "Kasandra", "Desiree", "Aracely", "Vonnie", "Rodrigo", "Lashay", "Antonette", "Elke",
                    "Lita", "Nadia", "Gregoria", "Ollie", "Shana", "Lenard",
                    "Klara", "Soledad", "Douglass", "Tyra"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mStrings = new ArrayList<String>(Arrays.asList(names));

        mLibuAdapter = new LibuAdapter(mStrings);

        mRecyclerView = (RecyclerView) findViewById(R.id.a_main_recycler);
        mRecyclerView.setAdapter(mLibuAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}
