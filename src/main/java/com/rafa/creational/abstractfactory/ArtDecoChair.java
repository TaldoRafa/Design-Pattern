package com.rafa.creational.abstractfactory;

public class ArtDecoChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Sentando em uma cadeira Art Déco");
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
        System.out.println("Esta cadeira Art Déco não possui ajuste de altura.");
    }
}
