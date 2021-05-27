package com.example.myphotoshop;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Resources r = Resources.getSystem();
        Configuration config = r.getConfiguration();
        onConfigurationChanged(config);

    }

    @Override
    public void onConfigurationChanged(@NonNull Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        switch (newConfig.orientation){
            case Configuration.ORIENTATION_LANDSCAPE:
                Toast.makeText(getApplicationContext(),"가로", Toast.LENGTH_LONG).show();
                break;
            case Configuration.ORIENTATION_PORTRAIT:
                Toast.makeText(getApplicationContext(),"세로",Toast.LENGTH_SHORT).show();
                return;
        }
    }
}