package com.rafa.creational.abstractfactory;

public class ModernCoffeeTable implements CoffeeTable {
    @Override
    public void placeItems(Object item) {
        System.out.println("Colocando " + item + " na mesa de centro moderna");
    }

    @Override
    public boolean hasStorage() {
        return true;
    }

    @Override
    public String getMaterial() {
        return "Vidro e Madeira";
    }

    @Override
    public boolean isFoldable() {
        return false;
    }
}
