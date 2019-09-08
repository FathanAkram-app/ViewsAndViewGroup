package com.fathanpklkt.viewsandviewgroup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public Button buttonbeli;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonbeli = (Button)findViewById(R.id.buttonbeli);
        buttonbeli.setOnClickListener(this);




        if (getSupportActionBar() !=null) {
            getSupportActionBar().setTitle("Google Pixel");
        }
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(MainActivity.this, Payment.class);
        startActivity(intent);
    }
}
