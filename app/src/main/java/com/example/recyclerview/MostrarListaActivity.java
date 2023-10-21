package com.example.recyclerview;

import static com.example.recyclerview.MainActivity.lstTrabajadores;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview.adapters.TrabajadorAdapter;
import com.example.recyclerview.databinding.ActivityMostrarListaBinding;

public class MostrarListaActivity extends AppCompatActivity {
    private ActivityMostrarListaBinding binding;
    private TrabajadorAdapter trabajadorAdapter;
    /*private RecyclerView recyclerView*/
    private LinearLayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*setContentView(R.layout.activity_mostrar_lista);*/
        binding = ActivityMostrarListaBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        Toast.makeText(this, "DATOS: " + lstTrabajadores, Toast.LENGTH_SHORT).show();
        // Configurando adaptador
        trabajadorAdapter = new TrabajadorAdapter(lstTrabajadores);
        layoutManager = new LinearLayoutManager(this);
        /*recyclerView = findViewById(R.id.rcvTrabajadores);
        recyclerView.setAdapter(trabajadorAdapter);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);*/
        binding.rcvTrabajadores.setAdapter(trabajadorAdapter);
        binding.rcvTrabajadores.setLayoutManager(layoutManager);
        binding.rcvTrabajadores.setHasFixedSize(true);
    }
}
