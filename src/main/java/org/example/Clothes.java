package org.example;

public class Clothes { // Одежда
    private String name;
    private int price;
    private int count;

    public String getName() {
        return name;
    }

    public Clothes setName(String name) {
        this.name = name;
        return this;
    }
    public int getPrice() {
        return price;
    }

    public int getCount() {
        return count;
    }
    public Clothes setPrice(int price) {
        this.price = price;
        return this;
    }
    public Clothes setCount(int count) {
        this.count += count;
        return this;
    }
    @Override
    public String toString() {
        return name;
    }
}
