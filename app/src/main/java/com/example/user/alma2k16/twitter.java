package com.example.user.alma2k16;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

/**
 * Created by user on 01-11-2015.
 */
public class twitter extends AppCompatActivity {
    WebView w;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rulesd);
        w=(WebView)findViewById(R.id.wbvw);
        w.setWebViewClient(new Web());
        w.getSettings().setJavaScriptEnabled(true);
        w.getSettings().setLoadWithOverviewMode(true);
        w.getSettings().setUseWideViewPort(true);
        w.loadUrl("https://twitter.com/almafiesta");

    }
    @Override
    public void onBackPressed() {
        SharedPreferences sp=this.getSharedPreferences("myPrefsKe", Context.MODE_PRIVATE);
        SharedPreferences.Editor ed=sp.edit();
        ed.putInt("ha",1);
        ed.commit();
        try {
            Class gh=Class.forName("com.example.user.alma2k16.MainActivity");
            Intent ie=new Intent(twitter.this,gh);
            startActivity(ie);
            this.finish();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
