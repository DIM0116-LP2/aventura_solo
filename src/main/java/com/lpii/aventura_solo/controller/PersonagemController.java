package com.lpii.aventura_solo.controller;

import org.springframework.web.bind.annotation.*;
import com.lpii.aventura_solo.model.personagem.Personagem;
import com.lpii.aventura_solo.service.PersonagemService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/personagem")
@RequiredArgsConstructor
public class PersonagemController {

    private final PersonagemService personagemService;

    @GetMapping
    public Personagem buscarPersonagem() {
        return personagemService.buscarPersonagem();
    }

    @PostMapping("/dano/{dano}")
    public Personagem receberDano(@PathVariable int dano) {
        return personagemService.receberDano(dano);
    }

    @PostMapping("/recuperar/{quantidade}")
    public Personagem recuperarVida(@PathVariable int quantidade) {
        return personagemService.recuperarVida(quantidade);
    }

    @PostMapping("/atacar")
    public Personagem atacarInimigo() {
        return personagemService.atacarInimigo();
    }
}
