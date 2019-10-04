package com.exemplo.recyclerview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class AdapterExemplo extends RecyclerView.Adapter<MyViewHolder> {

    private List<Item> listaItens;

    public AdapterExemplo(List<Item> listaItens) {
        this.listaItens = listaItens;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.adapter_itens, viewGroup, false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {

        Item item = listaItens.get(i);

        myViewHolder.textNumeroItem.setText(item.getTextNumeroItem());
        myViewHolder.textDescricaoItem.setText(item.getTextDescricaoItem());
        myViewHolder.textData.setText(item.getTextData());

    }

    @Override
    public int getItemCount() {
        return listaItens.size();
    }
}