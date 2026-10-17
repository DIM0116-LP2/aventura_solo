package com.lpii.aventura_solo.model.missao;

import lombok.Data;

import com.lpii.aventura_solo.model.item.*;

@Data
public final class Recompensa {

    private final Item item;

    private final int gold;

}
