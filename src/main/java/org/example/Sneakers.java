package org.example;

public class Sneakers extends Clothes implements Thing {
    //Open Closed Principle добаляя интерфес у класа появилась
    //новая функциональость, при этом код не измнился.
    //Single Responsibility Principle этот клас описывает только одну вещь "Кросовки", а не все вещи.
    private final String name = "Кроссовки";
    private final int price = 1500;
    @Override
    public void putOn() {
        System.out.println(name + " надеты");
    }
    @Override
    public String toString() {
        return name;
    }
    @Override
    public int getPrice() {
        return price;
    }
}
