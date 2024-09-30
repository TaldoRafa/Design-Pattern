package com.rafa.creational.factorymethod;

public class SeaLogistics implements Logistics {
    @Override
    public Transport createTransport() {
        return new Ship();
    }

    @Override
    public void planDelivery() {
        Transport transport = createTransport();
        System.out.println("Plan delivery via sea. " + transport.deliver());
    }
}
