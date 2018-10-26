package io.wwphsstechdesk.application.Main;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FAQActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faq);
    }

    public void showMain(View view){
        Intent intent = new Intent(this, MainActivity.class);
        this.startActivity(intent);
    }

    public void showParagraph(View view){
        Intent intent = new Intent(this, ScrollableActivity.class);
        this.startActivity(intent);
    }

    public void showWifiHelp(View view){
        Intent intent = new Intent(this, WifiActivity.class);
        this.startActivity(intent);
    }

    public void showLaptopChromebookHelp(View view){
        Intent intent = new Intent(this, LaptopChromebookActivity.class);
        this.startActivity(intent);
    }

    public void showProjectorHelp(View view){
        Intent intent = new Intent(this, ProjectorActivity.class);
        this.startActivity(intent);
    }

}
