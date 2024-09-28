package com.cscorner.rintonerecycle;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Ringmessage extends Activity {

    TextView ringg, mesage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ringmessage);

        ringg = findViewById(R.id.ringtone);
        mesage = findViewById(R.id.messagetune);
        ringg.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent k = new Intent(Ringmessage.this, recyclerview.class);
                startActivity(k);
            }
        });
        mesage.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent j = new Intent(Ringmessage.this, messagerecycle.class);
                startActivity(j);
            }
        });
    }
}