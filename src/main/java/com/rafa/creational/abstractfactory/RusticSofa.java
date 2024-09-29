package com.rafa.creational.abstractfactory;

public class RusticSofa implements Sofa {
    @Override
    public void lieDown() {
        System.out.println("Deitando em um sofá rústico");
    }

    @Override
    public boolean hasCushions() {
        return true;
    }

    @Override
    public boolean convertToBead() {
        return false;
    }

    @Override
    public int numberOfSeats() {
        return 3;
    }
}
