package com.example.midterm;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class ColorActivity extends AppCompatActivity {

    private LinearLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        layout = findViewById(R.id.colorLayout);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.color_menu, menu);
        return true;
    }

    public class LibraryMenuIds {
        public static final int MENU_RED = 1;
        public static final int MENU_GREEN = 2;
        public static final int MENU_YELLOW = 3;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == LibraryMenuIds.MENU_RED) {
            changeLayoutColor(Color.RED);
            return true;
        } else if (id == LibraryMenuIds.MENU_GREEN) {
            changeLayoutColor(Color.GREEN);
            return true;
        } else if (id == LibraryMenuIds.MENU_YELLOW) {
            changeLayoutColor(Color.YELLOW);
            return true;
        } else {
            return super.onOptionsItemSelected(item);
        }
    }

    private void changeLayoutColor(int color) {
        // Example method to change layout color
        findViewById(android.R.id.content).setBackgroundColor(color);
    }

}



