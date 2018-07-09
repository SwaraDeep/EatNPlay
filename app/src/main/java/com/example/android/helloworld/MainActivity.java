package com.example.android.helloworld;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void mobile(View view) {
        String number = "+9179939 97999";
        Intent mobile = new Intent(Intent.ACTION_DIAL);
        mobile.setData(Uri.parse("tel:" + number));
        if (mobile.resolveActivity(getPackageManager())!= null) {
                    startActivity(mobile);
                }
    }
    public void site(View view) {
        String site = "http://www.eatnplay.in";
        Uri webpage = Uri.parse(site);
        Intent click = new Intent(Intent.ACTION_VIEW, webpage);
        if(click.resolveActivity(getPackageManager())!= null) {
            startActivity(click);
        }
    }

    public void mail(View view) {
        String mail = "eatnplay@gmail.com";
        Intent site = new Intent(Intent.ACTION_SENDTO);
        site.setData(Uri.parse("mailto:" + mail));
        if (site.resolveActivity(getPackageManager()) != null) {
            startActivity(site);
        }
    }
    public void map(View view) {
        Intent det = new Intent(Intent.ACTION_VIEW);
        det.setData(Uri.parse("geo:17.014154 , 81.800137"));
        if (det.resolveActivity(getPackageManager()) != null) {
            startActivity(det);
        }
    }
}
