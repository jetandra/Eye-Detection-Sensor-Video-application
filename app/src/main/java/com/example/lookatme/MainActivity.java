package com.example.lookatme;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;

import com.pd.lookatme.LookAtMe;

public class MainActivity extends AppCompatActivity {
    private LookAtMe lookAtMe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lookAtMe = findViewById(R.id.lookme);
        lookAtMe.init(this);
        lookAtMe.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.hanuman));
        //lookAtMe.setVideoPath("https://file-examples-com.github.io/uploads/2017/04/file_example_MP4_640_3MG.mp4");

        lookAtMe.start();
        lookAtMe.setLookMe();

        getSupportActionBar().hide();


    }
}