package com.udgs12.udgiasu.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.udgs12.udgiasu.R;

public class dangnhap extends AppCompatActivity {
    private Button buttondangnhap1;
    private Button buttondangky1;
    private Button buttonthoat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dangnhap);
        buttondangnhap1 = (Button) findViewById(R.id.buttondangnhap);
        buttondangnhap1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(dangnhap.this, thongtincanhan.class);
                startActivity(intent);
            }
        });
        buttondangky1 = (Button) findViewById(R.id.buttondangky);
        buttondangky1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(dangnhap.this, dangky.class);
                startActivity(intent);
            }
        });
        buttonthoat = (Button) findViewById(R.id.buttonthoat);
        buttonthoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(dangnhap.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
