package com.example.pokemonproject;

import java.io.Serializable;

public class Pokemon implements Serializable {
    private String name;
    private int pic;
    private int attack;
    private int defense;
    private int total;

    public Pokemon(String name, int pic, int attack, int defense, int total) {
        this.name = name;
        this.pic = pic;
        this.attack = attack;
        this.defense = defense;
        this.total = total;
    }

    public String getName() {
        return name;
    }

    public int getPic() {
        return pic;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }

    public int getTotal() {
        return total;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPic(int pic) {
        this.pic = pic;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
