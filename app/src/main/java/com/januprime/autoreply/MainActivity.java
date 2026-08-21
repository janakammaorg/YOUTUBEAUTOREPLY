package com.januprime.autoreply;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.graphics.Color;
import android.view.Gravity;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // యాప్ ఓపెన్ చేయగానే కనిపించే డిజైన్ (UI)
        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setGravity(Gravity.CENTER);
        layout.setBackgroundColor(Color.WHITE);

        TextView text = new TextView(this);
        text.setText("JanuPrime AutoReply App is Running!");
        text.setTextSize(20);
        text.setTextColor(Color.BLACK);
        text.setPadding(0, 0, 0, 50);

        Button btn = new Button(this);
        btn.setText("Enable Notification Access");
        
        // బటన్ నొక్కగానే పర్మిషన్స్ పేజీకి వెళ్లే లాజిక్
        btn.setOnClickListener(v -> {
            startActivity(new Intent(Settings.ACTION_NOTIFICATION_LISTENER_SETTINGS));
        });

        layout.addView(text);
        layout.addView(btn);

        setContentView(layout);
    }
}
