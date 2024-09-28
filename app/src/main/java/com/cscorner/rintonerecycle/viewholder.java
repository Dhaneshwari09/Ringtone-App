package com.cscorner.rintonerecycle;

import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class viewholder extends RecyclerView.ViewHolder {

    TextView nameview;
    ImageView startbutton;
    ImageView pausebutton;

    public viewholder(@NonNull View itemView) {
        super(itemView);
        nameview = itemView.findViewById(R.id.txt_ringName);
        startbutton = itemView.findViewById(R.id.start);
        pausebutton = itemView.findViewById(R.id.pause);

    }
}
