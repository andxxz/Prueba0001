package com.primero.prueba0001;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //TextView
    EditText etNombreM,etApellidoM;
    TextView tvResultadoM;
    Button btAceptarM;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etNombreM=(EditText) findViewById(R.id.etNombre);
        etApellidoM=(EditText) findViewById(R.id.etApellido);
        etApellidoM.setText("");
        etNombreM.setText("");
        tvResultadoM=(TextView) findViewById(R.id.tvResultado);
        btAceptarM=(Button) findViewById(R.id.btAceptar);

        btAceptarM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvResultadoM.setText(etNombreM.getText() + " " + etApellidoM.getText());
            }
        });
    }
}