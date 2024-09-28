package com.cscorner.rintonerecycle;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class lancherpage extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lancherpage);

        Thread t = new Thread() {
            public void run() {
                try {
                    Thread.sleep(1000);
                    Intent i = new Intent(lancherpage.this, gridlayout.class);
                    startActivity(i);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        t.start();
    }
}