package com.welovecrazyquotes.thehungrydeveloper;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    CardView startersCard;
    CardView mainsCard;
    CardView dessertsCard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startersCard = findViewById(R.id.card_view_starters);
        mainsCard = findViewById(R.id.card_view_mains);
        dessertsCard = findViewById(R.id.card_view_desserts);

        startersCard.setOnClickListener(view -> {
            Intent startersActivityIntent = new Intent(MainActivity.this, StarterActivity.class);
            startActivity(startersActivityIntent);
        });

        mainsCard.setOnClickListener(view -> {
            Intent mainCoursesIntent = new Intent(MainActivity.this, MainCoursesActivity.class);
            startActivity(mainCoursesIntent);
        });

        TextView emailTextView = findViewById(R.id.text_view_email_address);
        emailTextView.setOnClickListener(view -> {
            Intent launchEmailAppIntent = new Intent(Intent.ACTION_SENDTO);
            launchEmailAppIntent.setData(Uri.parse("mailto:thehungrydeveloper@email.come"));
            startActivity(launchEmailAppIntent);
        });
        dessertsCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent dessertsActivityIntent = new Intent(MainActivity.this, DessertsActivity.class);
                startActivity(dessertsActivityIntent);
            }
        });
    }
}