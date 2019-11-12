package com.example.testjson;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button click;
    public static TextView data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        click = findViewById(R.id.pulsante);
        data = findViewById(R.id.fetcheddata);

        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fetchData process = new fetchData();
                process.execute();
            }
        });
    }
}
