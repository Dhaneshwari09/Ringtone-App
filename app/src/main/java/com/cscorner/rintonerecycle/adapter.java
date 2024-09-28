package com.cscorner.rintonerecycle;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class adapter extends RecyclerView.Adapter<viewholder> {
    private Context context;
    private List<item> items;
    private MediaPlayer mediaPlayer;
    private int currentlyplayingposition = -1;

    public adapter(Context context, List<item> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new viewholder(LayoutInflater.from(context).inflate(R.layout.layout, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull viewholder holder, int position) {
        item itemss = items.get(position);
        holder.nameview.setText(items.get(position).getName());

        // set visibility
        holder.startbutton.setVisibility(itemss.isIsplaying() ? View.INVISIBLE : View.VISIBLE);
        holder.pausebutton.setVisibility(itemss.isIsplaying() ? View.VISIBLE : View.INVISIBLE);

        // start button logic
        holder.startbutton.setOnClickListener(view -> {
            if (currentlyplayingposition != -1 && currentlyplayingposition != position) {
                // stop the previously playing song
                stopcurrentplayingSong();
            }
            // start new song
            startSong(itemss.getSongResId(), position);
        });

        // pause button logic
        holder.pausebutton.setOnClickListener(view -> {
            // pause current playing song
            if (mediaPlayer != null && mediaPlayer.isPlaying()) {
                mediaPlayer.pause();
                itemss.setIsplaying(false);
                notifyItemChanged(position);
            }
        });

        // handle completion of the song(when its finishes)
        if (mediaPlayer != null) {
            mediaPlayer.setOnCompletionListener(mediaPlayer1 -> {
                stopcurrentplayingSong();
            });
        }
    }

        // method start song
        private void startSong(int songResId, int position) {
        // play new song
        mediaPlayer = MediaPlayer.create(context, songResId);
        mediaPlayer.start();
        // mark the current item as playing
        items.get(position).setIsplaying(true);
        currentlyplayingposition = position;
        notifyItemChanged(position);
    }

        // method to stop current playing song
        private void stopcurrentplayingSong() {
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            mediaPlayer.release();
            mediaPlayer = null;
            // mark the previously item as not playing
            items.get(currentlyplayingposition).setIsplaying(false);
            notifyItemChanged(currentlyplayingposition);
            currentlyplayingposition = -1;
        }

    }
    @Override
    public int getItemCount() {
        return items.size();
    }
   // create meadiaplayer instance for handel backepressbutton
    public void stopMediaPlayer() {
        if (mediaPlayer != null) {
            if (mediaPlayer.isPlaying()) {
                mediaPlayer.stop();
                mediaPlayer.release();
                mediaPlayer = null;
            }
        }
    }
}

