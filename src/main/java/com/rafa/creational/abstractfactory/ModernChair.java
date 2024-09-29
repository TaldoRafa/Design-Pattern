package com.rafa.creational.abstractfactory;

public class ModernChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Sentando em uma cadeira moderna");
    }

    @Override
    public boolean hasLegs() {
        return true;
    }

    @Override
    public boolean recline() {
        return true;
    }

    @Override
    public void adjustHeight(int height) {
        System.out.println("Ajustando a altura da cadeira moderna para " + height);
    }
}
