package com.cscorner.rintonerecycle;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class viewholdermessage extends RecyclerView.ViewHolder {

    TextView nameview;
    ImageView startbutton;
    ImageView pausebutton;

    public viewholdermessage(@NonNull View itemView) {
        super(itemView);
        nameview = itemView.findViewById(R.id.txt_ringName);
        startbutton = itemView.findViewById(R.id.start);
        pausebutton = itemView.findViewById(R.id.pause);
    }
}