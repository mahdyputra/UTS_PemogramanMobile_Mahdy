package com.example.mahdy.uts_pemogramanmobile_mahdy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {
    EditText angkaPertama, angkaKedua;
    int hasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = getIntent();
        String title = intent.getStringExtra("title");
        setTitle(title);

    }

    public void hitungLuas(View view) {
    }
}
