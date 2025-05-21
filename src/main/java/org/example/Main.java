package org.example;

import java.util.Scanner;

public class Main {
    // Magic numbers - использование констант.
    public static final String RUB = " руб.";
    public static final int MAX_COUNT = 80_000;

    public static void main(String[] args) {
        //Liskov Substitution - принцип подстановки,наследники играют роль родителей.
        Clothes[] clothes = new Clothes[]{new Hat(), new Jeans(), new Sneakers()};

        printClothes(clothes);

        Scanner scanner = new Scanner(System.in);
       try {
           while (true) {
               heading();
               String input = scanner.nextLine();
               if (input.equals("end")) {
                   break;
               }
               String[] parts = input.split(" ");
               int category = Integer.parseInt(parts[0]) - 1;
               if (category < 0 || category > clothes.length) {
                   System.out.println("Нет такой категории");
               }
               clothes[category].setCount(Integer.parseInt(parts[1]));

           }
       }catch (ArrayIndexOutOfBoundsException e){
           System.out.println("Некорректный ввод");
       }
        printClothes(clothes);// Don’t Repeat Yoursel (DRY) - повторяющийся код выносим в отдельный метод.
        bascet(clothes);


    }

    private static void printClothes(Clothes[] clothes) {
        System.out.println("Список одежды: ");
        for (int i = 0; i < clothes.length; i++) {
            System.out.println((i + 1) + ". " + clothes[i].toString());
        }

    }

    private static void bascet(Clothes[] clothes) {
        int sum = 0;
        System.out.println("Корзина: ");
        for (Clothes clothing : clothes) {
            if (clothing.getCount() != 0) {
                sum += clothing.getPrice() * clothing.getCount();
                System.out.println(clothing
                        + " количество: " + clothing.getCount() + " шт."
                        + " цена: " + clothing.getPrice() + RUB
                        + " сумма: " + clothing.getPrice() * clothing.getCount() + RUB);
//                if (clothing instanceof Hat) {
//                    ((Hat) clothing).putOn();
//                } else if (clothing instanceof Jeans) {
//                    ((Jeans) clothing).putOn();
//                } else if (clothing instanceof Sneakers) {
//                    ((Sneakers) clothing).putOn();
//                }
            }
            if(sum > MAX_COUNT){
                System.out.println("\n" + "Сумма заказа превышает лимит " + MAX_COUNT + RUB);
            }
        }
        System.out.println("Итого: " + sum + RUB);
    }
    private static void heading () {
        System.out.println("\n" +
                "Выберите категорию одежды и количество для оптотвой закупки " +
                "или введите 'end' для выхода:");
    }
}