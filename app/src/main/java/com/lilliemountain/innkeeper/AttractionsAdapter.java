package com.lilliemountain.innkeeper;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class AttractionsAdapter extends RecyclerView.Adapter<AttractionsAdapter.AttractionsHolder> {
    List<Attractions> list;

    public AttractionsAdapter(List<Attractions> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public AttractionsHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view=LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_attractions,viewGroup,false);
        return new AttractionsHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AttractionsHolder attractionsHolder, int i) {
        attractionsHolder.name.setText(list.get(i).getName());
        attractionsHolder.place.setBackgroundResource(list.get(i).getPlace());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class AttractionsHolder extends RecyclerView.ViewHolder {
        TextView name;
        ImageView place;
        public AttractionsHolder(@NonNull View itemView) {
            super(itemView);
            name=itemView.findViewById(R.id.name);
            place=itemView.findViewById(R.id.place);
        }
    }
}
