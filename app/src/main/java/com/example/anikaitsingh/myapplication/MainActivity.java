package com.example.anikaitsingh.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void contactUs(View view){
        Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                "mailto","wwptechdesk@gmail.com", null));
        intent.putExtra(Intent.EXTRA_SUBJECT, "HELP!");
        intent.putExtra(Intent.EXTRA_TEXT, "My issue is ");
        startActivity(Intent.createChooser(intent, "Choose an Email client :"));
    }

    public void showToastAboutApp(View view){
        String message = "This app helps you with technology at WW-P South."
                +" Made by Anikait Singh.";
        Toast toast = Toast.makeText(this, message, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void showFAQ(View view){
        Intent intent = new Intent(this, FAQActivity.class);
        this.startActivity(intent);
    }
}
