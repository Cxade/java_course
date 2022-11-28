package com.ex;
import java.util.ArrayList;
import java.util.List;

// 2. Вывести все простые числа от 1 до 1000 

public class App 
{
    public static void main(String[] args) {
        System.out.println(getPrimes(1000));
    }
    public static List<Integer> getPrimes(int count) {
        List<Integer> primes = new ArrayList<>();
        if (count >= 2) {
            primes.add(2);
        }
        for (int i = 3; i <= count; i += 2) {
            if (isPrime(i, primes)) {
                primes.add(i);
            }
        }
        return primes;
    }

    public static boolean isPrime(int n, List<Integer> primes) {
        for (int i = 0; i < primes.size(); i++) {
            int prime = primes.get(i);
            if (prime * prime > n) {
                return true;
            }
            if (n % prime == 0) {
                return false;
            }
        }
        return true;
    }

}