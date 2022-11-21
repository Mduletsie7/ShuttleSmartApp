package com.example.shuttlesmartapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.webkit.WebView;

public class DriversProfiles extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drivers_profiles);

        WebView webView = (WebView) findViewById(R.id.AboutUs);
        webView.setBackgroundColor(Color.rgb(255, 255, 255));
        webView.loadUrl("file:///android_asset/aboutUs/index.html");
    }
}