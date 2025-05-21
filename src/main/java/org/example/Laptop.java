package org.example;

public class Laptop extends Clothes implements Battery, Device{
    //Interface Segregation Principle - применятьюся разные интерфейсы вместо одного.
    //Dependency Inversion Principle - можно менять один интерфейс на другой, не завися от их функциональности.
    private final String name = "Ноутбук";
    private final int price = 50000;

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }
    @Override
    public void charge() {
        System.out.println("Ииспользуйте зарядку ");
    }

    @Override
    public void turnOn() {
        System.out.println("Ноутбук включен");
    }

}
