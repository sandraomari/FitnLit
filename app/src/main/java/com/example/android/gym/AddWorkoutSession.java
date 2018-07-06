package com.example.android.gym;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

import java.text.DateFormat;
import java.util.Calendar;

public class AddWorkoutSession extends AppCompatActivity implements DatePickerDialog.OnDateSetListener, TimePickerDialog.OnTimeSetListener {

    Button date;
    TextView getdate, gettime;
    Calendar calendar;
    int day, month, year, hour, minute;
    int dayFinal, monthFinal, yearFinal, hourFinal, minuteFinal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout_sessions);

        date = (Button) findViewById(R.id.date);
        getdate = (TextView) findViewById(R.id.getdate);

        date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calendar = Calendar.getInstance();
                day = calendar.get(Calendar.DAY_OF_MONTH);
                month = calendar.get(Calendar.MONTH);
                year = calendar.get(Calendar.YEAR);

                DatePickerDialog datePickerDialog = new DatePickerDialog(AddWorkoutSession.this, AddWorkoutSession.this, year, month, day);
                datePickerDialog.show();
            }
        });
    }
    @Override
    public void onDateSet(DatePicker datepicker, int i,int i1, int i2) {
        dayFinal = i;
        monthFinal = i1 + 1;
        yearFinal = i2;

        calendar = Calendar.getInstance();
        hour = calendar.get(Calendar.HOUR_OF_DAY);
        minute = calendar.get(Calendar.MINUTE);

        TimePickerDialog timePickerDialog = new TimePickerDialog(AddWorkoutSession.this, AddWorkoutSession.this, hour, minute, android.text.format.DateFormat.is24HourFormat(this));
        timePickerDialog.show();

    }
    @Override
    public void onTimeSet(TimePicker timePicker, int i, int i1){
        hourFinal = i;
        minuteFinal = i1;

        getdate.setText(
                yearFinal +"\n"+
                    monthFinal +"\n"+
                        +dayFinal+"\n"
        );

        gettime.setText(
                "hour:"+hourFinal+"\n"+
                        "minute:"+minuteFinal+"\n"
        );
    }
}
