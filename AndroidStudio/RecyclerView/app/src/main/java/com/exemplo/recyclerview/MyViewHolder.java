package com.exemplo.recyclerview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class MyViewHolder extends RecyclerView.ViewHolder {

    TextView textNumeroItem, textDescricaoItem, textData;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);

        textNumeroItem = itemView.findViewById(R.id.textNumeroItem);
        textDescricaoItem = itemView.findViewById(R.id.textDescricaoItem);
        textData = itemView.findViewById(R.id.textData);

    }

}
