package com.rafa.creational.abstractfactory;

public class ArtDecoCoffeeTable implements CoffeeTable {
    @Override
    public void placeItems(Object item) {
        System.out.println("Colocando " + item + " na mesa de centro Art Déco");
    }

    @Override
    public boolean hasStorage() {
        return false;
    }

    @Override
    public String getMaterial() {
        return "Vidro e Cromo";
    }

    @Override
    public boolean isFoldable() {
        return false;
    }
}
