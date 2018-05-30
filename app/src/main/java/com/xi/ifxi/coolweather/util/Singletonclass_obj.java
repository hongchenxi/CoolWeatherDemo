package com.xi.ifxi.coolweather.util;

import android.app.Application;
import android.content.Context;
import android.view.View;
import android.widget.ProgressBar;

public class Singletonclass_obj extends Application {
    private ProgressBar progressBar;

    private  static  Singletonclass_obj singletoncalss_Obj;

    public static Singletonclass_obj getInstance() {
        return singletoncalss_Obj;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        singletoncalss_Obj = this;
    }

    public void showProgressBar(Context context) {
        progressBar = new ProgressBar(context, null, android.R.attr.progressBarStyleSmall);
    }

    public void hideProgressBar() {
        if (progressBar != null && progressBar.isShown()) {
            progressBar.setVisibility(View.INVISIBLE);
        }
    }
}
