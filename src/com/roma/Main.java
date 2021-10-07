package com.roma;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int x = scanner.nextInt();


        System.out.println("Введите второе число");
        int y = scanner.nextInt();
        System.out.println("Выберите операцию");
        System.out.println("+");
        System.out.println("-");
        System.out.println("*");
        System.out.println("/");
        String operation = scanner.next();
        int result;

            if (operation.equals("+")) {
                result = x + y;
                System.out.println("Результат = " + result);
            } else if (operation.equals("-")) {
                result = x - y;
                System.out.println("Результат = " + result);
            } else if (operation.equals("*")) {
                result = x * y;
                System.out.println("Результат = " + result);
            } else if (operation.equals("/")) {
                result = x / y;
                System.out.println("Результат = " + result);
            }
    }
}
