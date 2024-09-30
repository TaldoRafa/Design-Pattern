package com.rafa.creational.factorymethod;

public class Ship implements Transport {
    @Override
    public String deliver() {
        return "Delivered by Ship";
    }
}
