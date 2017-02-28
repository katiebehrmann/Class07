package com.example.android.class07;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchActivity(View view) {
        Intent intent = new Intent(this, SecondActivity.class);

        Person p = new Person("Katie", 28);

        intent.putExtra(Keys.PERSON, p);

        startActivity(intent);
    }
}
