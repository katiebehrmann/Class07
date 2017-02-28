package com.example.android.class07;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

import org.w3c.dom.Text;

import static android.R.id.message;

public class SecondActivity extends AppCompatActivity {

    private TextView displayMyText;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        displayMyText = (TextView) findViewById(R.id.display_my_text);

        Intent intent = getIntent();
        Person p = (Person) intent.getSerializableExtra(Keys.PERSON);
//        String message = intent.getStringExtra(Keys.STRING);
//        int num = intent.getIntExtra(Keys.NUM, 0);

        displayMyText.setText(p.toString());
    }
}
