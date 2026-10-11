package com.lpii.aventurasolo.model.personagem;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor(force = true) //force true temporario
@AllArgsConstructor
public abstract class Personagem{

    private final String name;
    private final int init_life;
    private int life;

}
