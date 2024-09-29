package com.rafa.creational.abstractfactory;

public class ModernSofa implements Sofa {
    @Override
    public void lieDown() {
        System.out.println("Deitando em um sofá moderno");
    }

    @Override
    public boolean hasCushions() {
        return true;
    }

    @Override
    public boolean convertToBead() {
        return true;
    }

    @Override
    public int numberOfSeats() {
        return 3;
    }
}
