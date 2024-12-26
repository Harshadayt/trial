package com.example.event_handling;

import static android.app.ProgressDialog.show;

import static com.example.event_handling.R.id.submit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
TextView t = findViewById(R.id.submit);
Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt=findViewById(R.id.buttons);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                t.setText("submitted");
                Toast.makeText(getApplicationContext(),"hello",Toast.LENGTH_LONG).show();

            }
        });
    }
}