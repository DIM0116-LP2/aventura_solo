package com.lpii.aventura_solo.service;

import org.springframework.stereotype.Service;
import com.lpii.aventura_solo.model.personagem.Personagem;
import com.lpii.aventura_solo.model.personagem.player.Guerreiro;
import com.lpii.aventura_solo.model.personagem.inimigo.Esqueleto;

@Service
public class PersonagemService {

    private final Personagem personagem = new Guerreiro("Guerreiro", 100, 15);
    private final Personagem inimigo = new Esqueleto("Esqueleto", 100, 10);

    public Personagem buscarPersonagem() {
        return personagem;
    }

    public Personagem receberDano(int dano) {
        personagem.takeDamage(dano);
        return personagem;
    }

    public Personagem recuperarVida(int quantidade) {
        personagem.heal(quantidade);
        return personagem;
    }

    public Personagem atacarInimigo() {
        personagem.attack(inimigo);
        return inimigo;
    }
}
