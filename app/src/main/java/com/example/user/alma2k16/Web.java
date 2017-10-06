package com.example.user.alma2k16;

import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by user on 01-11-2015.
 */
public class Web extends WebViewClient {
    @Override
    public boolean shouldOverrideUrlLoading(WebView v,String s){
        v.loadUrl(s);
        return true;
    }
}
