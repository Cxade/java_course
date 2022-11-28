package com.example;


import java.util.Scanner;

/**
 * Print Hello user.
 *
 */
public class App 
{
    public static void main(String[] args)
    {
        System.out.println ("What is your name?: ");

        Scanner scanner = new Scanner (System.in, "cp866");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.println(String.format ("Привет, %s!", name));
        scanner.close ();
    }
}