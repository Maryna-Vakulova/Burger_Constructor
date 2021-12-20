package com.company;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {

    public static void main(String[] args) {
        int result = 50;

        System.out.println("Здравствуйте! Вас приветствует конструктор бургера.");
        System.out.println("Стоимость бургера - 50 грн, но Вы можете выбрать дополнительный ингридиент: ");

        listIngredients();
        int ingredient = inputMethod();
        result = priceBurger(ingredient, result);
        getCheck(result);
    }

    public static void listIngredients() {
        for (Burger burger : Burger.values()) {
            System.out.println("№ " + burger.number + " " + burger + " - " + burger.price + " грн");
        }
        System.out.println("Для выбора введите № 1, 2 или 3 ");
    }

    public static int inputMethod() {
        try {
            Scanner scanner = new Scanner(System.in);
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            return 0;
        }
    }

    public static void getCheck(int result) {
        System.out.println("Хотите добавить еще ингридиент (да/нет)?");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        String s1 = "да";
        String s2 = "нет";

        if (str.equalsIgnoreCase(s1)) {
            listIngredients();
            int ingredient = inputMethod();
            result = priceBurger(ingredient, result);
            getCheck(result);
        } else if (str.equalsIgnoreCase(s2)) {
            System.out.println("Стоимость Вашего бургера: " + result + " грн");
        } else {
            System.out.println("К сожалению, Вы ввели некорректный ответ");
            System.out.println("Стоимость Вашего бургера с дополнительным ингридиентом: " + result + " грн");
        }
    }

    public static int priceBurger(int ingredient, int result) {
        switch (ingredient) {
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
