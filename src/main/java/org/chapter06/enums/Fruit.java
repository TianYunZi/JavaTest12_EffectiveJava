package org.chapter06.enums;

/**
 * Created by Admin on 2017/5/24.
 */
public enum Fruit {

    APPLE("red", 20), ORANGE("orange", 30), PEER("green", 25), BANANA("yellow", 40);

    private final String color;
    private final double price;

    Fruit(String color, double price) {
        this.color = color;
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    public static Fruit valueOf(int index) {
        switch (index) {
            case 0:
                return APPLE;
            case 1:
                return ORANGE;
            case 2:
                return PEER;
            case 3:
                return BANANA;
            default:
                throw new IllegalArgumentException("argument out of range");
        }
    }
}
