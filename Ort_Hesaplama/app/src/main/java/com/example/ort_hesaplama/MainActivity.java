package com.example.ort_hesaplama;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editYazili1,editYazili2,editYazili3;
    TextView textOrtalama,textDurum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onClick(View view) {
        float yazili1,yazili2,yazili3,ortalama;
        editYazili1=findViewById(R.id.editYazili1);
        editYazili2=findViewById(R.id.editYazili2);
        editYazili3=findViewById(R.id.editYazili3);
        textOrtalama=findViewById(R.id.textOrtalama);
        textDurum=findViewById(R.id.textDurum);
        if(editYazili1.length()==0 || editYazili2.length()==0 || editYazili3.length()==0){
            Toast.makeText(getApplicationContext(),"Yazılı alanları boş bırakılamaz.",Toast.LENGTH_SHORT).show();
        }
        else {
            yazili1 = Float.parseFloat(editYazili1.getText().toString());
            yazili2 = Float.parseFloat(editYazili2.getText().toString());
            yazili3 = Float.parseFloat(editYazili3.getText().toString());
            ortalama = (yazili1 + yazili2 + yazili3) / 3;
            textOrtalama.setText("Ortalamanız: " + ortalama);
            if (ortalama < 50) {
                textDurum.setText("Durum: KALDI");
                textDurum.setTextColor(Color.RED);
            } else {
                textDurum.setText("Durum: GEÇTİ");
                textDurum.setTextColor(Color.GREEN);
            }
        }
        }
}