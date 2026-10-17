package com.lpii.aventura_solo.model.personagem.inventario;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

import com.lpii.aventura_solo.model.item.Item;

public class Inventario {

    //===DATA
    private final LinkedList<Item> items;

    //  [ I ] CONSTRUCTOR
    public Inventario(){
        this.items = new LinkedList<>();
    }

    //  [ II ] METHODS
    public void add_item(Item item){
        Item inp = Objects.requireNonNull(item); // will need to do smth to avoid duplicate items
        items.add(inp);
    }
    public Item get(int idx){
        Item used = items.get(idx);
        items.remove(idx);
        return used;
    }
    public List<Item> list(){ return List.copyOf(items); }
    public boolean empty(){ return items.isEmpty(); }
    public int size(){ return items.size(); }

}
