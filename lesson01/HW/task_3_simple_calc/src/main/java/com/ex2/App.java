package com.ex2;

import java.util.Scanner;


// 3. Реализовать простой калькулятор

public class App 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "cp866");
        System.out.println("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.println("Введите операцию (+,-,*,/): ");
        char c = scanner.next().charAt(0);
        System.out.println("Введите второе число число: ");
        int b = scanner.nextInt();
        if (c == '+'){
            System.out.println(a + " + " + b + " = " + sum(a, b));
        }
        if (c == '-'){
            System.out.println(a + " - " + b + " = " + sub(a, b));
        }
        if (c == '*'){
            System.out.println(a + " * " + b + " = " + mult(a, b));
        }
        if (c == '/'){
            System.out.println(a + " / " + b + " = " + div(a, b));
        }
        scanner.close ();
    }
    public static int sum(int a, int b) {
        return a+b;
    }
    public static int sub(int a, int b) {
        return a-b;
    }
    public static int mult(int a, int b) {
        return a*b;
    }

    public static int div(int a, int b) {
        return a/b;
    }

}