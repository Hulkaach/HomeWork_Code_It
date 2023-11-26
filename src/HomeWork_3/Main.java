package HomeWork_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите количество градусов по Цельсию:");
        Scanner scanner = new Scanner(System.in);
        double gradus = scanner.nextDouble();
        System.out.println("Введенная температура " + gradus + " Цельсия соответствует температуре "+((gradus*1.8)+32)+" градусов по Фаренгейту");

        double euro = 97.07;
        double dollar = 88.60;
        System.out.println("Введи количество рублей: ");
        double rub = scanner.nextDouble();
        System.out.println(" Введенное количество рублей (" + rub +") соответствует\n - " + rub/euro + " Евро\n -" + rub/dollar + " Долларов");

    }
}
