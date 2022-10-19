package com.example.shuttlesmartapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.webkit.WebView;

public class UserFeedback extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_feedback);

        WebView webView = (WebView) findViewById(R.id.ContactForm);
        webView.setBackgroundColor(Color.rgb(255, 255, 255));
        webView.loadUrl("file:///android_asset/contactForm/index.html");
    }
}