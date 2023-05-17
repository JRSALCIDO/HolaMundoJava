package com.example.holamundojava;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    private EditText txtNombre;
    private TextView lblSaludo;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button btnSaludar = findViewById(R.id.btnSaludo);
        txtNombre = findViewById(R.id.txtSaludo2);
        lblSaludo = findViewById(R.id.lblSaludo);

        btnSaludar.setOnClickListener(view -> {
            if (txtNombre.getText().toString().isEmpty()) {
                Toast.makeText(MainActivity.this, "Favor de ingresar un nombre", Toast.LENGTH_SHORT).show();
            } else {
                String txtSaludar = txtNombre.getText().toString();
                lblSaludo.setText("Hola " + txtSaludar + " ¿Como Estás? <3");
            }
        });
    }
}