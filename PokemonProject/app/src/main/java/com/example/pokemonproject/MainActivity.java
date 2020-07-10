package com.example.pokemonproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<Pokemon> myPokemon=new ArrayList<>();

        Pokemon p1=new Pokemon("Picachu",R.drawable.picachou,120,100,220);
        Pokemon p2=new Pokemon("Sandslash",R.drawable.sandslash,200,100,300);
        Pokemon p3=new Pokemon("Clefairy",R.drawable.clefairy,80,80,160);
        Pokemon p4=new Pokemon("Jigglypuff",R.drawable.jigglypuff,90,80,170);
        Pokemon p5=new Pokemon("Vulpix",R.drawable.vulpix,80,70,150);
        Pokemon p6=new Pokemon("Growlithe",R.drawable.growlithe,200,250,450);

        myPokemon.add(p1);
        myPokemon.add(p2);
        myPokemon.add(p3);
        myPokemon.add(p4);
        myPokemon.add(p5);
        myPokemon.add(p6);

        RecyclerView rv=findViewById(R.id.reView);
        rv.setHasFixedSize(true);
        RecyclerView.LayoutManager lm=new LinearLayoutManager(this);
        rv.setLayoutManager(lm);

        pokemonAdapter adapter=new pokemonAdapter(myPokemon,this);
        rv.setAdapter(adapter);



    }
}