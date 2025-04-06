package com.example.wordupapp;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.wordupapp.DetailActivity;


import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder>{
    private Context context;
    private List<DataClass> dataList;

    public MyAdapter(List<DataClass> dataList, Context context) {
        this.dataList = dataList;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Log.d("DEBUG", "Binding item: " + dataList.get(position).getDeckName());

        holder.recImage.setImageResource(dataList.get(position).getDataImage());
        holder.recDeckName.setText(dataList.get(position).getDeckName());
        holder.recKnown.setText(String.valueOf(dataList.get(position).getKnown()));
        holder.recNotKnown.setText(String.valueOf(dataList.get(position).getNotKnown()));
        holder.recCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, DetailActivity.class);
                intent.putExtra("Image", dataList.get(holder.getAdapterPosition()).getDataImage());
                intent.putExtra("DeckName", dataList.get(holder.getAdapterPosition()).getDeckName());
                intent.putExtra("Known", dataList.get(holder.getAdapterPosition()).getKnown());
                intent.putExtra("NotKnown", dataList.get(holder.getAdapterPosition()).getNotKnown());

                context.startActivity(intent);
            }
        });
    }



    @Override
    public int getItemCount() {
        int size = dataList.size();
        Log.d("DEBUG", "Item count: " + size);
        return size;
    }

}

class MyViewHolder extends RecyclerView.ViewHolder {
    ImageView recImage;
    TextView recDeckName, recKnown, recNotKnown;
    CardView recCard;

    public MyViewHolder(@NonNull View itemView){
        super(itemView);

        recImage = itemView.findViewById(R.id.recImage);
        recDeckName = itemView.findViewById(R.id.recDeckName);
        recKnown = itemView.findViewById(R.id.recKnown);
        recNotKnown = itemView.findViewById(R.id.recNotKnown);
        recCard = itemView.findViewById(R.id.recCard);
    }
}