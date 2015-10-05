package com.youhack.stomy2.weather;

/**
 * Created by jslee on 15/10/5.
 */
public class Forecast {
    private Current mCurrent;
    private Hour[] mHourlyForecast;
    private Day[] mDailyForcast;

    public Current getCurrent() {
        return mCurrent;
    }

    public void setCurrent(Current current) {
        mCurrent = current;
    }

    public Hour[] getHourlyForecast() {
        return mHourlyForecast;
    }

    public void setHourlyForecast(Hour[] hourlyForecast) {
        mHourlyForecast = hourlyForecast;
    }

    public Day[] getDailyForcast() {
        return mDailyForcast;
    }

    public void setDailyForcast(Day[] dailyForcast) {
        mDailyForcast = dailyForcast;
    }
}
