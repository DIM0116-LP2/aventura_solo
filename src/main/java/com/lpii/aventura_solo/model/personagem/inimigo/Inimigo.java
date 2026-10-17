package com.lpii.aventura_solo.model.personagem.inimigo;

import com.lpii.aventura_solo.model.personagem.Personagem;

public abstract class Inimigo extends Personagem {

    public Inimigo(String name){
        super(name, 100);
    }
    public Inimigo(String name, int life){
        super(name, life);
    }

}
