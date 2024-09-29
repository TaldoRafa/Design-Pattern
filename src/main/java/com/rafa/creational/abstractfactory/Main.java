package com.rafa.creational.abstractfactory;

public class Main {
    public static void main(String[] args) {
        // Teste basico das funções fabricas

        testArtDeco();
        System.out.println("\n ##### ##### ##### \n");
        testMinimalist();
        System.out.println("\n ##### ##### ##### \n");
        testModern();
        System.out.println("\n ##### ##### ##### \n");
        testRustic();
        System.out.println("\n ##### ##### ##### \n");
        testVictorian();
    }

    private static void testArtDeco() {
        ArtDecoFurnitureFactory factory = new ArtDecoFurnitureFactory();

        Chair chair = factory.createChair();
        CoffeeTable coffeeTable = factory.createCoffeeTable();
        Sofa sofa = factory.createSofa();

        chair.sitOn();
        coffeeTable.placeItems("Pão de Queijo");
        sofa.lieDown();
    }

    private static void testMinimalist() {
        MinimalistFurnitureFactory factory = new MinimalistFurnitureFactory();

        Chair chair = factory.createChair();
        CoffeeTable coffeeTable = factory.createCoffeeTable();
        Sofa sofa = factory.createSofa();

        chair.sitOn();
        coffeeTable.placeItems("Celular");
        sofa.lieDown();
    }

    private static void testModern() {
        ModernFurnitureFactory factory = new ModernFurnitureFactory();

        Chair chair = factory.createChair();
        CoffeeTable coffeeTable = factory.createCoffeeTable();
        Sofa sofa = factory.createSofa();

        chair.sitOn();
        coffeeTable.placeItems("Carteira");
        sofa.lieDown();
    }

    private static void  testRustic() {
        RusticFurnitureFactory factory = new RusticFurnitureFactory();

        Chair chair = factory.createChair();
        CoffeeTable coffeeTable = factory.createCoffeeTable();
        Sofa sofa = factory.createSofa();

        chair.sitOn();
        coffeeTable.placeItems("Machado");
        sofa.lieDown();
    }

    private static void testVictorian() {
        VictorianFurnitureFactory factory = new VictorianFurnitureFactory();

        Chair chair = factory.createChair();
        CoffeeTable coffeeTable = factory.createCoffeeTable();
        Sofa sofa = factory.createSofa();

        chair.sitOn();
        coffeeTable.placeItems("Chave");
        sofa.lieDown();
    }
}
