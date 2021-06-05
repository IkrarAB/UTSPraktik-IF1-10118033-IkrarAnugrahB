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
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static String NIK = "com.ikrarab.utspraktik_if1_10118033_ikraranugrahb.NIK";
    public static String NAMA = "com.ikrarab.utspraktik_if1_10118033_ikraranugrahb.NAMA";
    public static String TANGGAL = "com.ikrarab.utspraktik_if1_10118033_ikraranugrahb.TANGGAL";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendValue(View view){
        Intent intent = new Intent(this, Preview_Data.class);

        EditText editNik = (EditText) findViewById(R.id.inNik);
        EditText editNama = (EditText) findViewById(R.id.inNama);
        EditText editTgl = (EditText) findViewById(R.id.inTgl);

        String nama = editNama.getText().toString();
        String nik = editNik.getText().toString();
        String tgl = editTgl.getText().toString();

        intent.putExtra(NAMA, nama);
        intent.putExtra(NIK, nik);
        intent.putExtra(TANGGAL, tgl);

        startActivity(intent);
    }

}