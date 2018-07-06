package com.example.android.gym;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class Dashboard extends AppCompatActivity implements View.OnClickListener{

    private CardView profile, gym_instructors, gyms, workouts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        profile = (CardView)findViewById(R.id.profile);
        gym_instructors = (CardView)findViewById(R.id.gym_instructors);
        gyms = (CardView)findViewById(R.id.gyms);
        workouts = (CardView)findViewById(R.id.workouts);

        profile.setOnClickListener(this);
        gym_instructors.setOnClickListener(this);
        gyms.setOnClickListener(this);
        workouts.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()){
            case R.id.profile : i = new Intent(this, Profile.class);startActivity(i); break;
            case R.id.gym_instructors: i = new Intent(this, Instructor.class);startActivity(i); break;
            case R.id.gyms : i = new Intent(this, MapsActivity.class);startActivity(i); break;
            case R.id.workouts: i = new Intent(this, WorkoutSessions.class);startActivity(i); break;
            default:break;
        }
    }
}
