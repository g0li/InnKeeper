package com.lilliemountain.innkeeper;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.List;

public class HotelsAdapter extends RecyclerView.Adapter<HotelsAdapter.HotelsHolder> {
    List<Hotels> list;

    public HotelsAdapter(List<Hotels> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public HotelsHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view=LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_hotels,viewGroup,false);
        return new HotelsHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HotelsHolder hotelsHolder, int i) {
        hotelsHolder.name.setText(list.get(i).getName());
        hotelsHolder.hotel.setBackgroundResource(list.get(i).getPlace());
        hotelsHolder.rate.setText(list.get(i).getRate());
        hotelsHolder.rating.setRating(list.get(i).getRating());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class HotelsHolder extends RecyclerView.ViewHolder {
        TextView name,rate;
        Button book;
        RatingBar rating;
        ImageView hotel;
        public HotelsHolder(@NonNull View itemView) {
            super(itemView);
            name=itemView.findViewById(R.id.name);
            hotel=itemView.findViewById(R.id.hotel);
            rating=itemView.findViewById(R.id.rating);
            rate=itemView.findViewById(R.id.rate);
            book=itemView.findViewById(R.id.book);
        }
    }
}
