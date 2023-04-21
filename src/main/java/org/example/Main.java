package org.example;


public class Main {
    public static void main(String[] args) {

        Fruit fruit = Fruit.BANANA;
        switch (fruit) {
            case APPLE -> System.out.println("This is Apple!");
            case BANANA, ORANGE -> System.out.println("This is not");
        }

        // проитерироваться по всему енуму фруктов, вальюс взвращает массив из енумов

        for (Fruit elem: Fruit.values()) {
            System.out.println(elem);
        }
        System.out.println(Fruit.valueOf("APPLE"));
    }
}