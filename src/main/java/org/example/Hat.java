package org.example;

public class Hat extends Clothes implements Thing {

    private final String name = "Шапка";
    private final int price = 100;

    @Override
    public void putOn() {
        System.out.println(name + " надета");
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
