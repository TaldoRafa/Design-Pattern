package com.rafa.creational.abstractfactory;

public class RusticFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new RusticChair();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new RusticCoffeeTable();
    }

    @Override
    public Sofa createSofa() {
        return new RusticSofa();
    }
}
