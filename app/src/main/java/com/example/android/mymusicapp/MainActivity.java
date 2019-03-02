package com.example.android.mymusicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        // Find the View that shows the numbers category
        TextView funky = (TextView) findViewById(R.id.funky);

        // Set a click listener on that View (funky)
        funky.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the playlist funky View is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link FunkyActivity}
                Intent funkyIntent = new Intent(MainActivity.this, FunkyActivity.class);

                // Start the new activity
                startActivity(funkyIntent);
            }
        });

        // Find the View that shows the love songs category
        TextView love = (TextView) findViewById(R.id.love);

        // Set a click listener on that View (love)
        love.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the playlist love View is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link LoveSongsActivity}
                Intent loveIntent = new Intent(MainActivity.this, LoveSongsActivity.class);

                // Start the new activity
                startActivity(loveIntent);

            }
        });

        // Find the View that shows the colors category
        TextView party = (TextView) findViewById(R.id.party);

        // Set a click listener on that View (party)
        party.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the playlist party View is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PartyActivity}
                Intent partyIntent = new Intent(MainActivity.this, PartyActivity.class);

                // Start the new activity
                startActivity(partyIntent);

            }
        });

        // Find the View that shows the colors category
        TextView relax = (TextView) findViewById(R.id.relax);

        // Set a click listener on that View (relax)
        relax.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the playlist relax View is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link RelaxActivity}
                Intent relaxIntent = new Intent(MainActivity.this, RelaxActivity.class);

                // Start the new activity
                startActivity(relaxIntent);

            }

        });

        // Find the View that shows the colors category
        TextView workout = (TextView) findViewById(R.id.workout);

        // Set a click listener on that View (workout)
        workout.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the playlist Workout View is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link WorkingOutActivity}
                Intent workoutIntent = new Intent(MainActivity.this, WorkingOutActivity.class);

                // Start the new activity
                startActivity(workoutIntent);

            }

        });

    }

}


