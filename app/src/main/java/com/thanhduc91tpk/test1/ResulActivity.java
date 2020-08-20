package com.thanhduc91tpk.test1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class ResulActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resul);

        Intent intent = getIntent();
        String ten = intent.getStringExtra("Key_1");
        int tuoi = intent.getIntExtra("Key_2", 0);

    }
}