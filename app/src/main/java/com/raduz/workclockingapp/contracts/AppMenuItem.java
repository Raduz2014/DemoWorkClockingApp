package com.raduz.workclockingapp.contracts;

import android.content.Context;
import android.graphics.drawable.Drawable;

import androidx.core.content.ContextCompat;

import com.raduz.workclockingapp.R;

import java.util.ArrayList;

public class AppMenuItem {
    public static final String WORK_IN = "work_in";
    public static final String WORK_OUT = "work_out";
    public static final String WORK_STATS = "work_stats";
    public static final String WORK_VACANTION = "work_vacantion";
    public static final String WORK_FULLSCREEN = "work_fullscreen";
    public static final String WORK_EXIT = "work_exit_app";

    public Drawable imgIcon;
    public String title;
    public String key;

    public AppMenuItem() {
    }


    public AppMenuItem(Drawable icon, String title, String key) {
        this.imgIcon = icon;
        this.title = title;
        this.key = key;
    }

    public static ArrayList<AppMenuItem> buildMainHomeItemsList(Context c) {
        ArrayList<AppMenuItem> menuList = new ArrayList<>();

        menuList.add(new AppMenuItem(ContextCompat.getDrawable(c, R.drawable.ic_work_red_36dp), "Work in", WORK_IN));
        menuList.add(new AppMenuItem(ContextCompat.getDrawable(c, R.drawable.ic_work_green_36dp), "Work out", WORK_OUT));
        menuList.add(new AppMenuItem(ContextCompat.getDrawable(c, R.drawable.ic_report_36dp), "Work stats", WORK_STATS));
        menuList.add(new AppMenuItem(ContextCompat.getDrawable(c, R.drawable.ic_sentiment_satisfied_36dp), "Vacation days", WORK_VACANTION));
        menuList.add(new AppMenuItem(ContextCompat.getDrawable(c, R.drawable.ic_fullscreen_exit_36dp), "Fullscreen", WORK_FULLSCREEN));
        menuList.add(new AppMenuItem(ContextCompat.getDrawable(c, R.drawable.ic_exit_to_app_36dp), "Exit", WORK_EXIT));

        return menuList;
    }
}
