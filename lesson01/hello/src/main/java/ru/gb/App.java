package ru.gb;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Print Hello world and date and time.
 *
 */
public class App 
{
    public static void main(String[] args)
    {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern ("yyyy.MM.dd HH:mm:ss");
        System.out.println (LocalDateTime.now().format (formatter));
    }
}

