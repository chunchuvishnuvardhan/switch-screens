package com.example.switchscreens;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;


import androidx.appcompat.app.AppCompatActivity;

import org.jetbrains.annotations.Nullable;

public class SecondScreen extends AppCompatActivity {

    private static final String TAG = "SecondScreen";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_screen);
      Button btnNavToFirst= (Button) findViewById(R.id.btnGoToFirstScreen);
        
        btnNavToFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: clicked btn nav to second");
                Intent intent = new Intent(SecondScreen.this, MainActivity.class);
                startActivity(intent);
            }
    });
}
}
