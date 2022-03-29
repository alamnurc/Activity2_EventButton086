package com.example.sampleconstraintlayout086;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ActivityLihatData extends AppCompatActivity {

    TextView tvnama,tvnomer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lihat_data);

        tvnama = findViewById(R.id.tvNamaKontak);
        tvnomer = findViewById(R.id.tvNomerTelepon);

        //membuat variabel dengan jenis data bundle
        // dan assign value dari variabel tersebut
        // dengan getIntent().getExtras()
        Bundle bundle = getIntent().getExtras();

        //Membuat variabel nama dan assign value dari pesan
        // yang dikirimkan dari activity sebelumnya
        String nama = bundle.getString("a");

        switch (nama)
        {
            case "Inayah":
                tvnama.setText("Inayah M");
                tvnomer.setText("08122233344");
                break;
            case "Ilham":
                tvnama.setText("Ilham R");
                tvnomer.setText("08122233345");
                break;
            case "Eris":
                tvnama.setText("Eris J");
                tvnomer.setText("08122233346");
                break;
            case "Fikri":
                tvnama.setText("M Fikri");
                tvnomer.setText("08122233347");
                break;
            case "Maul":
                tvnama.setText("Maul M");
                tvnomer.setText("08122233348");
                break;
            case "Intan":
                tvnama.setText("Intan S");
                tvnomer.setText("08122233349");
                break;
            case "Vina":
                tvnama.setText("Vina R");
                tvnomer.setText("08122233350");
                break;
            case "Gita":
                tvnama.setText("Gita S");
                tvnomer.setText("08122233351");
                break;
            case "Lutfi":
                tvnama.setText("Lutfi M");
                tvnomer.setText("08122233352");
                break;
            case "Vian":
                tvnama.setText("Vian M");
                tvnomer.setText("08122233353");
                break;
        }
    }
}