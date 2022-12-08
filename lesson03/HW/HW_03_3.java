/*
3. Задан целочисленный список ArrayList.
Найти минимальное, максимальное и среднее арифметичское этого списка.
*/

package HW;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class HW_03_3 {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        int len = 10;

        for (int i = 0; i < len; i++) {
            int num = random.nextInt(51);
            System.out.print(num + " ");
            list.add(num);
        }

        int max = list.get(0);
        int min = list.get(0);
        int average = 0;
        for (int j = 0; j < list.size(); j++) {
            if (list.get(j) > max){
                max = list.get(j);
            }
            if (list.get(j) < min){
                min = list.get(j);
            }
            average += list.get(j)/len;
        }
    System.out.println();
    System.out.println("Минимальное: " + min);
    System.out.println("Максимальное: " + max);
    System.out.println("Среднее арифметичское: " + average);
    }    
}
