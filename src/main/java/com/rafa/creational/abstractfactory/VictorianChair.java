package com.rafa.creational.abstractfactory;

public class VictorianChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Sentando em uma cadeira vitoriana");
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
        System.out.println("Esta cadeira vitoriana não possui ajuste de altura.");
    }
}
