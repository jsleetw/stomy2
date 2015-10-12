package com.youhack.stomy2.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.youhack.stomy2.R;
import com.youhack.stomy2.weather.Day;

/**
 * Created by jslee on 15/10/12.
 */
public class DayAdapter extends BaseAdapter {

    private Context mContext;
    private Day[] mDays;

    public DayAdapter(Context context, Day[] days) {
        mContext = context;
        mDays = days;
    }

    @Override
    public int getCount() {
        return mDays.length;
    }

    @Override
    public Object getItem(int i) {
        return mDays[i];
    }

    @Override
    public long getItemId(int i) {
        return 0; //we aren't going to use this.
    }

    @Override
    public View getView(int i, View converView, ViewGroup viewGroup) {
        ViewHolder holder;

        if (converView == null) {
            // brand new
            converView = LayoutInflater.from(mContext).inflate(R.layout.daily_list_item, null);
            holder = new ViewHolder();
            holder.iconImageView = (ImageView) converView.findViewById(R.id.iconImageView);
            holder.temperatureLabel = (TextView) converView.findViewById(R.id.temperatureLabel);
            holder.dayLabel = (TextView) converView.findViewById(R.id.dateNameLabel);

            converView.setTag(holder);
        }
        else {
            holder = (ViewHolder) converView.getTag();
        }

        Day day = mDays[i];

        holder.iconImageView.setImageResource(day.getIconId());
        holder.temperatureLabel.setText(day.getTemperatureMax() + "");
        holder.dayLabel.setText(day.getDayOfTheWeek());

        return converView;
    }

    private static class ViewHolder {
        ImageView iconImageView; //public by default
        TextView dayLabel;
        TextView temperatureLabel;
    }
}
