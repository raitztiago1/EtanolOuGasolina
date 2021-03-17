package com.raitztiago1.alcoolougasolina;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editPrecoEtanol;
    private EditText editPrecoGasolina;
    private TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editPrecoEtanol = findViewById(R.id.txtInEtanol);
        editPrecoGasolina = findViewById(R.id.txtInGasolina);
        txtResultado = findViewById(R.id.txtResultado);


    }

    public void calcValor(View view){
        Double valorEtanol = Double.parseDouble(editPrecoEtanol.getText().toString());
        Double valorGasolina = Double.parseDouble(editPrecoGasolina.getText().toString());

        Double result = valorEtanol/valorGasolina;

        if(result >=0.7){

            txtResultado.setText("Melhor Utilizar Gasolina!");

        }else{

            txtResultado.setText("Melhor Utilizar Etanol!");

        }
    }
}
//aaa