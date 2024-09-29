package com.rafa.creational.abstractfactory;

public class RusticChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Sentando em uma cadeira rústica");
    }

    @Override
    public boolean hasLegs() {
        return true;
    }

    @Override
    public boolean recline() {
        return false;
    }

    @Override
    public void adjustHeight(int height) {
        System.out.println("Esta cadeira rústica não possui ajuste de altura.");
    }
}
