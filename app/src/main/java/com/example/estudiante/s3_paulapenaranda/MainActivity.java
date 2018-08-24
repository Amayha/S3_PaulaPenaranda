package com.example.estudiante.s3_paulapenaranda;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    EditText et_masa;
    EditText et_altura;
    Button btn_calcular;
    TextView lbl_resultado;
    double masa;
    double altura;
    double resultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicial);


        lbl_resultado = findViewById(R.id.lbl_resultado);
        btn_calcular = findViewById(R.id.btn_calcular);
        et_altura = findViewById(R.id.et_altura);
        et_masa = findViewById(R.id.et_masa);

        btn_calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                masa = Double.parseDouble(et_masa.getText().toString());
                altura = Double.parseDouble(et_altura.getText().toString());
                resultado = (masa/Math.pow(altura,2));
                lbl_resultado.setText(Double.toString(resultado));


            }
        });

        /*tv_titulo = findViewById(R.id.tv_titulo);
        et_nombre = findViewById(R.id.et_nombre);
        btn_calcular = findViewById(R.id.btn_calcular);*/


       /* btn_calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nombre = et_nombre.getText().toString();
                // Double.parseDouble(nombre)-- en caso de tener que pasarlo a double
                // Integer.parseInt(nombre)
               tv_titulo.setText("Hola "+nombre);

                Toast.makeText( MainActivity.this,"Hola "+nombre, Toast.LENGTH_SHORT ).show();
                // toast es un mensajito que aparece unos segundos
                
            }
        });*/




    }

}
