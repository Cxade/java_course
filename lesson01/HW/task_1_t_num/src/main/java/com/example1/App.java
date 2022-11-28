package com.example1;

// 1. Вычислить n-ое треугольное число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

public class App 
{
    public static void main(String[] args) {
        triangl(10);
        factorial(6);
    }
    public static void triangl (int n) {
        int result = n/2*(n+1);
        System.out.format("n-ое треугольного числа %d --> %d", n, result);
        System.out.println();
    }
    public static void factorial (int n) {
        int result = 1;
        for(int i = 1; i <= n; i++){
            result = result * i;
        }
        System.out.format("!%d = %d", n, result);
        System.out.println();
    }
}
