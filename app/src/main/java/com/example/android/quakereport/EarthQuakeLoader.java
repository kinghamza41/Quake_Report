package com.example.android.quakereport;

import android.content.AsyncTaskLoader;
import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;


import java.util.List;

public class EarthQuakeLoader extends AsyncTaskLoader<List<EarthQuake>> {
    private String  mUrl;
    public EarthQuakeLoader(Context context, String url) {
        super(context);
        mUrl = url;
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    @Override
    public List<EarthQuake> loadInBackground() {
       if (mUrl==null){
           return null;
       }
       return QueryUtils.fetchEarthquakeData(mUrl);
    }
}
