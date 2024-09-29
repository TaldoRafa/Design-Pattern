package com.rafa.creational.abstractfactory;

public class MinimalistChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Sentando em uma cadeira minimalista");
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
        System.out.println("Esta cadeira minimalista não possui ajuste de altura.");
    }
}
