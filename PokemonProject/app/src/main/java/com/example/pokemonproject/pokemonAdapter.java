package com.example.pokemonproject;


import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.MenuView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.Adapter;

import java.util.ArrayList;

public class pokemonAdapter extends RecyclerView.Adapter {
    ArrayList<Pokemon> pArray;
    Context c;
   //generate constructor
    public pokemonAdapter(ArrayList<Pokemon> pArray, Context c) {
        this.pArray = pArray;
        this.c = c;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //add these lines
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.pokemon_item,parent,false);
        ViewHolder vh=new ViewHolder(v);
        return vh;

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, final int position) {
        //connecting the pokemon attributes with the view
        ((ViewHolder)holder).img.setImageResource(pArray.get(position).getPic());
        ((ViewHolder)holder).pokemonName.setText(pArray.get(position).getName());
        ((ViewHolder)holder).pokemonAttack.setText(pArray.get(position).getAttack()+"");
        ((ViewHolder)holder).pokemonDefense.setText(pArray.get(position).getDefense()+"");
        //set up listener for details
        ((ViewHolder)holder).view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(c,Details.class);
                i.putExtra("passPokemon",pArray.get(position));
                c.startActivity(i);

            }
        });
        //set up the delete icon listener
        ((ViewHolder)holder).deletePK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pArray.remove(position);
                notifyDataSetChanged();//to refresh the RecyclerView
            }
        });

    }

    @Override
    public int getItemCount() {
        return pArray.size();
    }
    //inner class to connect the item xml with the adapter
    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView img;
        public TextView pokemonName;
        public TextView pokemonAttack;
        public TextView pokemonDefense;
        public View view;
        public ImageView deletePK;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            //add these lines to connect item xml with adapter
            view=itemView;
            pokemonName=itemView.findViewById(R.id.tvName);
            pokemonAttack=itemView.findViewById(R.id.tvAttack);
            pokemonDefense=itemView.findViewById(R.id.tvDefense);
            img=itemView.findViewById(R.id.imageView);
            deletePK=itemView.findViewById(R.id.delete);

        }


    }
}
