package com.example.alura.agenda;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;


public class ListaAlunosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_alunos);

        String[] alunos = {"Tiago", "Andreia", "Dayene", "Valdirene", "Silvio", "Vanessa", "Ana", "Lucas", "Arthut", "Victor", "Ailton",
        "Silvia", "Junior", "David", "Jonatan", "Joao", "Dalmasio"};

        ListView listaAlunos = findViewById(R.id.lista_alunos);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, alunos );
        listaAlunos.setAdapter(adapter);

        Button novo_aluno = findViewById(R.id.novo_aluno);
        novo_aluno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentVaiProFormulario = new Intent(ListaAlunosActivity.this, FormularioActivity.class);
                startActivity(intentVaiProFormulario);
            }
        });

    }
}
