package com.example.beskonechniy;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        int rnd = (int) (Math.random()*100);
        TextView txt = findViewById(R.id.textView);
        txt.setText( getString(R.string.ссылка)+String.valueOf(rnd));

    }

    public void click(View v)
    {
        Intent intent = new Intent(MainActivity.this,
                MainActivity.class);
        startActivity(intent);
    }



    private void init() {
        Button btnback = findViewById(R.id.btnback);



        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
