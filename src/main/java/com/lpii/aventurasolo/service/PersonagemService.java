package com.lpii.aventurasolo.service;

import org.springframework.stereotype.Service;
import com.lpii.aventurasolo.model.personagem.Personagem;

@Service
public abstract class PersonagemService {

    // [ II ] METHODS
    public final String get_name(){ return this.name; }
    public int get_life(){ return this.life; }
    public boolean isAlive(){ return this.life>0; }
    protected final int get_init_life() { return this.init_life; }

    public void heal(int life_healed){
        if (life_healed < 0){
            throw new IllegalArgumentException("You can't use the heal method for damage.");
        }
        this.life = Math.max(1, Math.min(this.life + life_healed, init_life));
    }
    public void takeDamage(int hit){
        if (hit < 0){
            throw new IllegalArgumentException("You can't use the takeDamage method to heal.");
        }
        this.life -= hit;
        if(this.life < 0){ this.life = 0;}
        System.out.printf("%s took %d damage! Life: %d\n", this.name, hit, this.life);
        if(this.life <= 0){
            die();
        }
    }
    public abstract void attack(Personagem p);
    protected abstract void die();

}
