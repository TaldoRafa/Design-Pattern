package com.rafa.creational.abstractfactory;

public class MinimalistCoffeeTable implements CoffeeTable {
    @Override
    public void placeItems(Object item) {
        System.out.println("Colocando " + item + " na mesa de centro minimalista");
    }

    @Override
    public boolean hasStorage() {
        return false;
    }

    @Override
    public String getMaterial() {
        return "Madeira ou Metal";
    }

    @Override
    public boolean isFoldable() {
        return false;
    }
}
