package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.recyclerview.databinding.ActivityMainBinding;
import com.example.recyclerview.databinding.ActivityMostrarListaBinding;
import com.example.recyclerview.models.Trabajador;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    /*Button btnAgregar, btnMostrar, btnAcercaDe;*/
    private ActivityMainBinding binding;
    public static ArrayList<Trabajador> lstTrabajadores;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*setContentView(R.layout.activity_main);*/
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        lstTrabajadores = new ArrayList<Trabajador>();

        /*btnAgregar = findViewById(R.id.btnAgregar);
        btnMostrar = findViewById(R.id.btnMostrar);
        btnAcercaDe = findViewById(R.id.btnAcercaDe);*/

        binding.btnAgregar.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, ElegirTipoTrabajadorActivity.class));
        });

        binding.btnMostrar.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, MostrarListaActivity.class));
        });

        binding.btnAcercaDe.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, AcercaDe.class));
        });
    }
}