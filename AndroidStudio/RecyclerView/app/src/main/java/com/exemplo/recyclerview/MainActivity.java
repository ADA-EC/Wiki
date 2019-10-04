package com.exemplo.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    //Variável global para referenciar o RecyclerView da interface
    private RecyclerView recyclerViewExemplo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Conectando a classe representativa com o componente de layout
        recyclerViewExemplo = findViewById(R.id.recyclerViewExemplo);

        //Configurando o LayoutManager e inserindo a configuração em nosso RecyclerView
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(
                this,
                LinearLayoutManager.VERTICAL,
                false
        );
        recyclerViewExemplo.setLayoutManager(layoutManager);
    }
}