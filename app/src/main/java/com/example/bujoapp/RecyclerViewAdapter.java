package com.example.bujoapp;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>{

    private static final String TAG="com.example.bujoapp.RecyclerViewAdapter";

    private ArrayList<String> barNames = new ArrayList<>();
    private ArrayList<String> days = new ArrayList<>();
    private Context context;

    public RecyclerViewAdapter(ArrayList<String> barNames, ArrayList<String> days, Context context) {
        this.barNames = barNames;
        this.days = days;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_listitem, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Log.d(TAG, "onBindViewHolder: called.");
        holder.day.setText(days.get(position));
    }

    @Override
    public int getItemCount() {
        return days.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView bar;
        TextView day;
        ConstraintLayout parentLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            bar = itemView.findViewById(R.id.bar);
            day = itemView.findViewById(R.id.date);
            parentLayout = itemView.findViewById(R.id.parent_layout);
        }
    }

}
