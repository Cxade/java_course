// package com.example2;

// /**
//  * Hello world!
//  *
//  */


// // Если в массиве есть числа, равные заданному, 
// // нужно перенести эти элементы в конец массива. 


// public class App 
// {
//     public static void main( String[] args )
//     {
//         int[] numbers = {1, 3, 2, 3, 2, 3, 2};
//         int num = 0;
//         int find = 3;
//         for(int j = 0; j < numbers.length; j++){
//             for (int i = 1; i < numbers.length; i++){
//                 if (numbers[i] != find){
//                     num = numbers[i - 1];
//                     numbers[i - 1] = numbers[i];
//                     numbers[i] = num;
//                 }

//             }
//         }
//         for (int number : numbers) {
//             System.out.format( "%d", number );
//         }
//         System.out.println();
//     }
// }




// ВАРИАНТ 2

package com.example2;


public class App 
{
    public static void main( String[] args )
    {
        int[] numbers = {2, 3, 2, 2, 3};
        int search = 3;

        int where = numbers.length - 1;

        while(where >= 0 && numbers[where] == search)
            where--;
        for(int i = 0; i < where; i++){
            if (numbers[i] == search) {
                int temp = numbers[i];
                numbers[i] = numbers[where];
                numbers[where] = temp;
                where--;
            }
        }
        for(int number : numbers)
            System.out.format("%d", number);
        System.out.println();
    }
}