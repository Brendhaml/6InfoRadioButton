package com.example.a6inforadiobutton;

import android.icu.util.IslamicCalendar;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public EditText aliasValor1, aliasValor2;
    RadioButton aliassoma, aliassubtrair, aliasmultiplic, aliasdividir;
    public Double resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        aliasValor1=(EditText)findViewById(R.id.editValor1);
        aliasValor2=(EditText)findViewById(R.id.editValor2);
        aliassoma=findViewById(R.id.radioButtonSoma);
        aliassubtrair=findViewById(R.id.radioButtonSubtração);
        aliasmultiplic=findViewById(R.id.radioButtonMultip);
        aliasdividir=findViewById(R.id.radioButtonDivisao);
    }

    public void Calcular(View view){
        if(aliassoma.isChecked()) {
            resultado = Double.parseDouble(aliasValor1.getText().toString()) + Double.parseDouble(aliasValor2.getText().toString());
            Toast.makeText(this, "Total: " + resultado, Toast.LENGTH_SHORT).show();
        }
        else if(aliassubtrair.isChecked()) {
            resultado = Double.parseDouble(aliasValor1.getText().toString()) - Double.parseDouble(aliasValor2.getText().toString());
            Toast.makeText(this, "Total: " + resultado, Toast.LENGTH_SHORT).show();
        }
        else if(aliasmultiplic.isChecked()) {
            resultado = Double.parseDouble(aliasValor1.getText().toString()) * Double.parseDouble(aliasValor2.getText().toString());
            Toast.makeText(this, "Total: " + resultado, Toast.LENGTH_SHORT).show();
        }
        else if(aliasdividir.isChecked()) {
            resultado = Double.parseDouble(aliasValor1.getText().toString()) / Double.parseDouble(aliasValor2.getText().toString());
            Toast.makeText(this, "Total: " + resultado, Toast.LENGTH_SHORT).show();
        }
    }
}

