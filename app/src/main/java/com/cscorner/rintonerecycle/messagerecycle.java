package com.cscorner.rintonerecycle;

import android.app.Activity;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class messagerecycle extends Activity {

    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_messagerecycle);


            recyclerView = findViewById(R.id.recycle);

            List<item> items = new ArrayList<item>();
            items.add(new item("Message Tune01" , false , R.raw.messageone));
            items.add(new item("Message Tune02" , false , R.raw.smsthree));
            items.add(new item("Message Tune03" , false , R.raw.smsthree));
            items.add(new item("Message Tune04" , false , R.raw.sms4));
            items.add(new item("Message Tune05" , false , R.raw.sms5));
            items.add(new item("Message Tune06" , false , R.raw.sms6));
            items.add(new item("Message Tune07", false , R.raw.sms7));
            items.add(new item("Message Tune08" , false , R.raw.sms9));
            items.add(new item("Message Tune09", false , R.raw.sms10));
            items.add(new item("Message Tune10" , false , R.raw.sms11));
            items.add(new item("Message Tune11", false , R.raw.sms12));
            items.add(new item("Message Tune12", false , R.raw.sms13));
            items.add(new item("Message Tune13",false , R.raw.sms14));
            items.add(new item("Message Tune14", false , R.raw.sms15));
            items.add(new item("Message Tune15",false , R.raw.sms8));
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
            recyclerView.setAdapter(new adapter(getApplicationContext(), items));
        }
    }
