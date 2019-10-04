package com.exemplo.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    //Variável global para referenciar o RecyclerView da interface
    private RecyclerView recyclerViewExemplo;

    //Lista de itens a serem apresentadas na lista
    private List<Item> listaItens = new ArrayList<>();

    //Adapter a ser utilizado no RecyclerView
    private AdapterExemplo adapterExemplo;

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

        criarItens();

        //Instanciando o Adapter e vinculando-o ao RecyclerView
        adapterExemplo = new AdapterExemplo(listaItens);
        recyclerViewExemplo.setAdapter(adapterExemplo);
    }

    //Criando base de dados
    private void criarItens(){
        Item item;

        item = new Item(
                "1",
                "Potato são potatos.",
                "04/10/2019"
        );
        listaItens.add(item);

        item = new Item(
                "2",
                "Talvez potatos sejam diferentes.",
                "05/04/2019"
        );
        listaItens.add(item);

        item = new Item(
                "3",
                "Você disse potato?",
                "15/06/2019"
        );
        listaItens.add(item);

        item = new Item(
                "4",
                "Adoro dizer potatos.",
                "08/01/2019"
        );
        listaItens.add(item);


        item = new Item(
                "5",
                "Faz potatos para o jantar, por favor.",
                "27/09/2019"
        );
        listaItens.add(item);

        item = new Item(
                "6",
                "Sabe o que agrega status? Potatos.",
                "05/02/2019"
        );
        listaItens.add(item);

        item = new Item(
                "7",
                "Clínica de tratamento para potatos.",
                "01/10/2019"
        );
        listaItens.add(item);

        item = new Item(
                "8",
                "Cansei de potatos.",
                "01/10/2019"
        );
        listaItens.add(item);

        item = new Item(
                "9",
                "Alguém ajuda o potato, rápido!",
                "01/10/2019"
        );
        listaItens.add(item);

        item = new Item(
                "10",
                "Minha vida se resume em potatos.",
                "01/10/2019"
        );
        listaItens.add(item);

        item = new Item(
                "11",
                "Qual a sua palavra favorita? Potato!",
                "01/10/2019"
        );
        listaItens.add(item);
    }

}