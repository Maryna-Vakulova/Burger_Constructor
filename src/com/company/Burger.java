package com.company;

public enum Burger {
    СОУС(10),
    CЫР(20),
    КОТЛЕТА(30);

    int price;

    Burger(int price) {
        this.price = price;
    }
}
