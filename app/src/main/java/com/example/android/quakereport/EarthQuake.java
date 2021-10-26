package com.example.android.quakereport;

public class EarthQuake {
    private Double mMagnitude;
    private String mLocation;
    private long mTimeInMilliSecond;
    private String mUrl;

    public EarthQuake(Double mMagnitude, String mLocation, long timeInMilliSecond, String url) {
        this.mMagnitude = mMagnitude;
        this.mLocation = mLocation;
        this.mTimeInMilliSecond = timeInMilliSecond;
        this.mUrl = url;
    }

    public Double getMagnitude() {
        return mMagnitude;
    }

    public String getLocation() {
        return mLocation;
    }

    public long getTimeInMilliSecond() {
        return mTimeInMilliSecond;
    }

    public String getUrl() {
        return mUrl;
    }


}
