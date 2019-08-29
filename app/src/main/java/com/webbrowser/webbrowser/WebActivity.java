package com.webbrowser.webbrowser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebActivity extends AppCompatActivity {

    WebView web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        web=findViewById(R.id.web);
        String getUrl=getIntent().getExtras().getString("url");

        web.setWebViewClient(new WebViewClient());
        web.getSettings().setBuiltInZoomControls(true);

        web.loadUrl("http://"+getUrl);
    }

    @Override
    public boolean onKeyDown (int keyCode, KeyEvent event){

        if((keyCode==KeyEvent.KEYCODE_BACK)&& web.canGoBack())
             {
                 web.goBack();
            }
            else
        {
            finish();
        }
        return super.onKeyDown(keyCode,event);

        }
}
