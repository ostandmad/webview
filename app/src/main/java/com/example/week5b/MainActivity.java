package com.example.week5b;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WebView mywebview = (WebView) findViewById(R.id.webView);
// mywebview.loadUrl("https://www.vardhaman.org/");
        String data = "<html><body><h1>WELCOME TO VARDHAMAN CSE!!!</h1><br><marquee>17881A0535 P.Sai Teja Shashank</marquee></body></html>";
        mywebview.loadData(data, "text/html", "UTF-8");
    }
}