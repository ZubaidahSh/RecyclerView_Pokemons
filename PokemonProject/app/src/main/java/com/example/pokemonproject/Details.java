package com.example.pokemonproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Details extends AppCompatActivity {
    TextView DetailsName;
    TextView DetailAttack;
    TextView DetailDefense;
    ImageView DetailsPic;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        DetailsName=findViewById(R.id.textView);
        DetailAttack=findViewById(R.id.textView2);
        DetailDefense=findViewById(R.id.textView3);
        DetailsPic=findViewById(R.id.imageView2);

        Bundle b=getIntent().getExtras();
        Pokemon pk=(Pokemon)b.getSerializable("passPokemon");
        DetailsName.setText(pk.getName());
        DetailAttack.setText("Attack: "+pk.getAttack());
        DetailDefense.setText("Defense: "+pk.getDefense());
        DetailsPic.setImageResource(pk.getPic());
    }
}