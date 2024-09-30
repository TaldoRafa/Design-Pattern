package com.rafa.creational.factorymethod;

public class RoadLogistics implements Logistics {
    @Override
    public Transport createTransport() {
        return new Truck();
    }

    @Override
    public void planDelivery() {
        Transport transport = createTransport();
        System.out.println("Plan delivery via road. " + transport.deliver());
    }
}
