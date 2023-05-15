package sg.edu.rp.c346.id22022452.dateandtime;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {

    DatePicker dp;
    TimePicker tp;
    Button btnDisplayDate;
    Button btnDisplayTime;
    TextView tvDisplay;
    Button btnReset;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dp =  findViewById(R.id.datePicker);
        tp = findViewById(R.id.timePicker);
        btnDisplayDate = findViewById(R.id.displayDateButton);
        btnDisplayTime = findViewById(R.id.displayTimeButton);
        tvDisplay = findViewById(R.id.textViewDisplay);
        btnReset = findViewById(R.id.reset);


        btnDisplayTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String hour = String.valueOf(tp.getHour());
                String min = String.valueOf(tp.getMinute());
                tvDisplay.setText("Time is " + hour + ":" + min);
            }

        });
        btnDisplayDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String year = String.valueOf(dp.getYear());
                String month = String.valueOf(dp.getMonth() +1);
                String day = String.valueOf(dp.getDayOfMonth());
                tvDisplay.setText("Date is " + day + "/" + month + "/" + year);

            }
        });
        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tp.setHour(0);
                tp.setMinute(00);
                dp.updateDate(2020,0,1);
                tvDisplay.setText("Resetted");
            }
        });




    }
}