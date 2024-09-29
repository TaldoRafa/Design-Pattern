package com.rafa.creational.abstractfactory;

public interface Chair {
    void sitOn();
    boolean hasLegs();
    boolean recline();
    void adjustHeight(int height);
}
