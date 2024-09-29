package com.rafa.creational.abstractfactory;

public class MinimalistSofa implements Sofa {
    @Override
    public void lieDown() {
        System.out.println("Deitando em um sofá minimalista");
    }

    @Override
    public boolean hasCushions() {
        return false;
    }

    @Override
    public boolean convertToBead() {
        return false;
    }

    @Override
    public int numberOfSeats() {
        return 2;
    }
}
