package HomeWork_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 12;
        int catCount = 2;
        int dogCount = 4;
        int tele2 = 45;
        String str1 = "Это строка";
        char c1 = 'a';
        char c2 = 'b';
        Integer it = new Integer(10);
        float num3 = 0.004f;
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(catCount);
        System.out.println(dogCount);
        System.out.println(tele2);
        System.out.println(str1);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(it);
        System.out.println(num3);

        System.out.println("А теперь калькулятор!");
        System.out.println("Введи первое число: ");
        double number1 = new Scanner(System.in).nextDouble();
        System.out.println("Введи второе число: ");
        double number2 = new Scanner(System.in).nextDouble();
        System.out.println("Чего с ними сделать? : \n1.Сложить\n2.Вычесть\n3.Умножить\n4.Разделить");
        int choice = new Scanner(System.in).nextInt();
        if (choice == 1){
            System.out.println("Результат сложения равен "+ (number1+number2));
        }
        if (choice == 2){
            System.out.println("Результат вычитания равен "+ (number1-number2));
        }
        if (choice == 3){
            System.out.println("Результат умножения равен "+ number1*number2);
        }
        if (choice == 4){
            System.out.println("Результат деления равен "+ number1/number2);
        }


    }
}
