package com.rafa.creational.abstractfactory;

public class RusticCoffeeTable implements CoffeeTable {
    @Override
    public void placeItems(Object item) {
        System.out.println("Colocando " + item + " na mesa de centro rústica");
    }

    @Override
    public boolean hasStorage() {
        return true;
    }

    @Override
    public String getMaterial() {
        return "Madeira de Pinheiro";
    }

    @Override
    public boolean isFoldable() {
        return false;
    }
}
