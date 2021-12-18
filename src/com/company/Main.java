package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Здравствуйте! Вас приветствует конструктор бургера");
        System.out.println("Стандартная стоимость бургера - 50 грн, но Вы можете выбрать дополнительный ингридиент: ");
        listIngridients();

        int ing = inputMethod();
        int result = 50;
        result = priceBurger(ing, result);

        String str = getMethod();
        getCheck(str, result);
    }

    public static int inputMethod() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static String getMethod() {
        System.out.println("Хотите добавить еще один ингридиент (да/нет)?");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static void listIngridients() {
        for (Burger burger : Burger.values()) {
            System.out.println(burger + " - " + burger.price);
        }
        System.out.println("Выберите 1, 2 или 3 соответственно порядка");
    }

    public static void getCheck(String str, int result) {
        String s1 = "да";
        String s2 = "нет";
        if (str.equalsIgnoreCase(s1)) {
            listIngridients();
            int ing1 = inputMethod();
            int result1 = priceBurger(ing1, result);
            System.out.println("Стоимость бургера составит: " + result1 + " грн");
        } else if (str.equals(s2)) {
            System.out.println("Стоимость бургера составит: " + result + " грн");
        } else {
            System.out.println("Что-то пошло не так");
        }
    }


    public static int priceBurger(int ing, int result) {
        switch (ing) {
            case 1:
                result += 10;
                break;
            case 2:
                result += 20;
                break;
            case 3:
                result += 30;
                break;
            default:
                System.out.println("Что-то пошло не так");
        }
        return result;

    }
}
