package com.fovbe.android.meetupchallenge;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void talkBtn (View view ){
        Context currentActivity = MainActivity.this;
        Intent talkActivity = new Intent(currentActivity, Activity2.class);
        startActivity(talkActivity);
    }

    public void honestBtn (View view ){
        Context currentActivity = MainActivity.this;
        Intent honestActivity = new Intent(currentActivity, Activity3.class);
        startActivity(honestActivity);
    }

    public void commitBtn (View view ){
        Context currentActivity = MainActivity.this;
        Intent commitActivity = new Intent(currentActivity, Commit.class);
        startActivity(commitActivity);
    }

    public void feedbackEmail (View v){
        String[] contacts = {"i.omafovbe@gmail.com"};
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:")); // only email apps should handle this
        intent.putExtra(Intent.EXTRA_EMAIL, contacts);
        intent.putExtra(Intent.EXTRA_SUBJECT, "Feedback on Relationship App");
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
}
