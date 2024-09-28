package com.cscorner.rintonerecycle;

import android.app.Activity;
import android.content.Intent;
import android.database.DataSetObserver;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class recyclerview extends Activity {

    RecyclerView recyclerView;
    private adapter adapterr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclerview);


        recyclerView = findViewById(R.id.recycle);

        List<item> items = new ArrayList<item>();
        items.add(new item("Ringtone01", false, R.raw.ringone));
        items.add(new item("Ringtone02", false, R.raw.ringtwo));
        items.add(new item("Ringtone03", false, R.raw.ringthree));
        items.add(new item("Ringtone04", false, R.raw.ringfour));
        items.add(new item("Ringtone05", false, R.raw.ringfive));
        items.add(new item("Ringtone06", false, R.raw.ringsix));
        items.add(new item("Ringtone07", false, R.raw.ringseven));
        items.add(new item("Ringtone08", false, R.raw.ringeight));
        items.add(new item("Ringtone09", false, R.raw.ringnine));
        items.add(new item("Ringtone10", false, R.raw.ringten));
        items.add(new item("Ringtone11", false, R.raw.ringeleven));
        items.add(new item("Ringtone12", false, R.raw.ringtweleve));
        items.add(new item("Ringtone13", false, R.raw.ringthirteen));
        items.add(new item("Ringtone14", false, R.raw.ringfourteen));
        items.add(new item("Ringtone15", false, R.raw.ringfifteen));
        adapterr = new adapter(this, items);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapterr);

    }

    // take a meadiaplayer reference from adapterclass for stop play song
    @Override
    public void onBackPressed() {
        if (adapterr != null) {
            adapterr.stopMediaPlayer();
        }

        super.onBackPressed();
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (adapterr != null) {
            adapterr.stopMediaPlayer();
        }
    }
}