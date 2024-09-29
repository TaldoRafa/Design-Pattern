package com.rafa.creational.abstractfactory;

public class MinimalistFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new MinimalistChair();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new MinimalistCoffeeTable();
    }

    @Override
    public Sofa createSofa() {
        return new MinimalistSofa();
    }
}
