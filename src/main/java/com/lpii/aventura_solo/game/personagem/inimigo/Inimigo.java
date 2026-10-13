package com.lpii.aventura_solo.game.personagem.inimigo;

import com.lpii.aventura_solo.game.personagem.Personagem;

public abstract class Inimigo extends Personagem {

    public Inimigo(String name){
        super(name, 100);
    }
    public Inimigo(String name, int life){
        super(name, life);
    }

}
