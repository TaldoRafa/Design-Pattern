package com.rafa.creational.abstractfactory;

public class VictorianCoffeeTable implements CoffeeTable {
    @Override
    public void placeItems(Object item) {
        System.out.println("Colocando " + item + " na mesa de centro vitoriana");
    }

    @Override
    public boolean hasStorage() {
        return true;
    }

    @Override
    public String getMaterial() {
        return "Madeira de Carvalho";
    }

    @Override
    public boolean isFoldable() {
        return false;
    }
}
