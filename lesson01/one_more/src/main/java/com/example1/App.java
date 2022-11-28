package com.example1;

/**
 * Нахождение максимального кол-ва 1 в списке
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int count = 0;
        int maxLen = 0;
        int [] numbers = {1, 1, 1, 0, 1, 0, 1, 1, 1, 1, 0};
        for (int num: numbers)
        {
            if (num == 1)
            {
                count++;
                if (maxLen < count) //проверка самый ли большой maxLen
                {
                maxLen = count;
                }
            }
            else
            {
                count = 0;
            }
        } 
        System.out.format("количество 1 = %d", maxLen);
    }
}
