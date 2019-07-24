package com.raduz.workclockingapp;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.raduz.workclockingapp.contracts.AppMenuItem;
import com.raduz.workclockingapp.ui.MainMenuAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();

    ArrayList<AppMenuItem> menuItemsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        menuItemsList = AppMenuItem.buildMainHomeItemsList(this);

        GridView gvAppMenu = findViewById(R.id.appMenuOptionGridView);
        final MainMenuAdapter menuAdapter = new MainMenuAdapter(this, menuItemsList);
        gvAppMenu.setAdapter(menuAdapter);
        gvAppMenu.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                AppMenuItem itemSelected = menuItemsList.get(position);
                String key = itemSelected.key;
                if (key.equals(AppMenuItem.WORK_IN)) {
                    Toast.makeText(getBaseContext(), "Open Work in", Toast.LENGTH_LONG).show();
                } else if (key.equals(AppMenuItem.WORK_OUT)) {
                    Toast.makeText(getBaseContext(), "Open Work out", Toast.LENGTH_LONG).show();
                } else if (key.equals(AppMenuItem.WORK_STATS)) {
                    Toast.makeText(getBaseContext(), "Open Work stats", Toast.LENGTH_LONG).show();
                } else if (key.equals(AppMenuItem.WORK_VACANTION)) {
                    Toast.makeText(getBaseContext(), "Open Work vacation", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getBaseContext(), "Open default", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
    }
}
