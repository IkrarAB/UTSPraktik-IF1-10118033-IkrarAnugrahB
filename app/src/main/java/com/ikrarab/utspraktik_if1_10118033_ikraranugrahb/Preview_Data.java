/**
 * Tanggal Pengerjaan   : 05 Juni 2021
 * NIM                  : 10118033
 * Nama                 : Ikrar Anugrah Bastary
 * Kelas                : IF-1/S1/VI
 */

package com.ikrarab.utspraktik_if1_10118033_ikraranugrahb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Preview_Data extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preview_data);

        Intent intent = getIntent();
        TextView outNik = findViewById(R.id.outNik);
        TextView outNama = findViewById(R.id.outNama);
        TextView outTgl = findViewById(R.id.outTgl);

        String nama = intent.getStringExtra(MainActivity.NAMA);
        String nik = intent.getStringExtra(MainActivity.NIK);
        String tgl = intent.getStringExtra(MainActivity.TANGGAL);

        outNik.setText(nik);
        outNama.setText(nama);
        outTgl.setText(tgl);
    }

    public void simpan(View view){
        Intent intent1 = new Intent(this, Berhasil.class);
        startActivity(intent1);
        finish();
    }

}