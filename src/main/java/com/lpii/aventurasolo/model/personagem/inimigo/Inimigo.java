package com.lpii.aventurasolo.model.personagem.inimigo;

import com.lpii.aventurasolo.model.personagem.Personagem;

public abstract class Inimigo extends Personagem {

    public Inimigo(String name){
        super(name, 100);
    }
    public Inimigo(String name, int life){
        super(name, life);
    }

}
