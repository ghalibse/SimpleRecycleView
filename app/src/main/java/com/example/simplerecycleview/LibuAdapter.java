package com.example.simplerecycleview;

import android.graphics.Color;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by admin on 8/8/2016.
 */
public class LibuAdapter extends RecyclerView.Adapter<LibuAdapter.ViewHolder> {

    private static final String TAG = "LibuAdapterTAG_";
    private ArrayList<String> mStrings;


    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView textViewName;

        public ViewHolder(View itemView) {
            super(itemView);

            textViewName = (TextView) itemView.findViewById(R.id.r_list_txt);
        }
    }


    public LibuAdapter(ArrayList<String> strings) {
        this.mStrings = strings;
    }

    @Override
    public LibuAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.list_item, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final LibuAdapter.ViewHolder holder, int position) {

        final String string = mStrings.get(position);
        TextView textView = holder.textViewName;
        textView.setText(string);

        holder.textViewName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Snackbar.make(holder.itemView,"HELLO : " + string,Snackbar.LENGTH_LONG).show();
            }
        });

    }

    @Override
    public int getItemCount() {

        return mStrings == null ? 0 : mStrings.size();
    }
}
