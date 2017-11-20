package com.example.mahdy.uts_pemogramanmobile_mahdy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView lvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvResult = (ListView) findViewById(R.id.lvResult);
        Intent intent = getIntent();
        lvResult.setOnItemClickListener(this);
        String[][] dataBangun = new String[][]{{"Persegi", "klikdisini", "persegi"}, {"Lingkaran", "klikdisini", "lingkaran"}, {"Segitiga", "klikdisini", "segitiga"}, {"Persegi Panjang", "klikdisini", "persegipanjang"}, {"Trapesium", "klikdisini", "trapesium"}};

        ListAdapter adapter = new com.example.mahdy.uts_pemogramanmobile_mahdy.ListAdapter(MainActivity.this, dataBangun);
        lvResult.setAdapter(adapter);
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
        switch (position) {
            case 0:
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("title", "Persegi");
                intent.putExtra("gambar",R.drawable.persegi);
                startActivity(intent);
                break;
            case 1:
                intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("title", "Lingkaran");
                intent.putExtra("gambar",R.drawable.lingkaran);
                startActivity(intent);
                break;
            case 2:
                intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("title", "Segitiga");
                intent.putExtra("gambar",R.drawable.segitiga);
                startActivity(intent);
                break;
            case 3:
                intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("title", "Persegi Panjang");
                intent.putExtra("gambar",R.drawable.persegipanjang);
                startActivity(intent);
                break;
            case 4:
                intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("title", "Trapesium");
                intent.putExtra("gambar",R.drawable.trapesium);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}
