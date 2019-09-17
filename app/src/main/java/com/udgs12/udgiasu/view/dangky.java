package com.udgs12.udgiasu.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.udgs12.udgiasu.R;

public class dangky extends AppCompatActivity {
    private Button buttondongy1;
    private Button buttonhuy1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dangky);
        buttondongy1 = (Button) findViewById(R.id.buttondongy);
        buttondongy1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(dangky.this, dangnhap.class);
                startActivity(intent);
            }
        });
        buttonhuy1 = (Button) findViewById(R.id.buttonhuy);
        buttonhuy1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(dangky.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
