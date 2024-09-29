package com.rafa.creational.abstractfactory;

public interface CoffeeTable {
    void placeItems(Object item);
    boolean hasStorage();
    String getMaterial();
    boolean isFoldable();
}
