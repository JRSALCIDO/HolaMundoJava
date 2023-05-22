package com.example.holamundojava;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    private Button btnSaludar;
    private Button btnLimpiar;
    private Button btnFin;
    private EditText txtNombre;
    private TextView lblSaludo;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        btnSaludar = findViewById(R.id.btnSaludo);
        btnLimpiar = findViewById(R.id.btnLimpiar);
        btnFin = findViewById(R.id.btnFin);
        txtNombre = findViewById(R.id.txtSaludo2);
        lblSaludo = findViewById(R.id.lblSaludo);

        btnSaludar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txtNombre.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Favor de ingresar un nombre", Toast.LENGTH_SHORT).show();
                } else {
                    String txtSaludar = txtNombre.getText().toString();
                    lblSaludo.setText("Hola " + txtSaludar + " ¿Cómo Estás? <3");
                }
            }
        });
        btnLimpiar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                txtNombre.setText("");
                lblSaludo.setText("");
            }

                }
        );
        btnFin.setOnClickListener(new View.OnClickListener(){
                                          @Override
                                          public void onClick(View view){
                                              finish();
                                          }

                                      }
        );

    }
}