package org.example;

public class Jeans extends Clothes implements Thing {
    private final String name = "Джинсы";
    private final int price = 500;

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
