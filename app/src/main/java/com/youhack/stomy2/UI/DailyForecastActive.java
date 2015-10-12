package com.youhack.stomy2.ui;

import android.app.ListActivity;
import android.os.Bundle;

import com.youhack.stomy2.R;
import com.youhack.stomy2.adapters.DayAdapter;
import com.youhack.stomy2.weather.Day;

public class DailyForecastActive extends ListActivity {

    private Day[] mDays;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_forecast_active);

        /*
        String[] daysOfTheWeek = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday",
                                   "Friday", "Saturday" };
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,
                daysOfTheWeek );
        setListAdapter(adapter);
        */

        DayAdapter adapter new DayAdapter(this, mDays);
    }
}
