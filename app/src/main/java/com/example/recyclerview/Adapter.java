package com.example.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Adapter extends RecyclerView.Adapter <Adapter.ViewHolder> {

    private String[] data;
    public Adapter ( String[] data){

        this.data = data;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.list_item_layout,parent,false);


        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    String title = data[position];
    holder.txttitle.setText(title);


    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView txttitle;
        ImageView imgicon;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imgicon = (ImageView) itemView.findViewById(R.id.imgicon);
            txttitle = (TextView) itemView.findViewById(R.id.texttitle);
        }
    }
}
