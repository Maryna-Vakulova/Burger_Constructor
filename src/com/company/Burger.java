package com.company;

public enum Burger {
    СОУС(10, 1),
    CЫР(20, 2),
    КОТЛЕТА(30, 3);

    int price;
    int number;

    Burger(int price, int number) {
        this.price = price;
        this.number = number;
    }
}
