package com.webbrowser.webbrowser;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText etxtURL;
    Button btnGo,btnFacebook,btnGoogle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnGo= findViewById(R.id.btn_go);
        btnFacebook= findViewById(R.id.btn_facebook);
        btnGoogle= findViewById(R.id.btn_google);
        etxtURL=findViewById(R.id.etxt_URL);

        btnGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = etxtURL.getText().toString();

                if (url.isEmpty()) {
                    etxtURL.setError("Enter Url");
                    etxtURL.requestFocus();
                } else {
                    Intent intent = new Intent(MainActivity.this, WebActivity.class);
                    intent.putExtra("url", url);
                    startActivity(intent);
                }
            }  });

                btnFacebook.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent=new Intent(MainActivity.this,WebActivity.class);
                        intent.putExtra("url","www.facebook.com");
                        startActivity(intent);

                    }

                });
                btnGoogle.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent=new Intent(MainActivity.this,WebActivity.class);
                        intent.putExtra("url","www.google.com");
                        startActivity(intent);

                    }

                });

            }
        }
