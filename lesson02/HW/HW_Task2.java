// Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.

package HW;

import java.util.Arrays;
import java.lang.System.Logger.Level;

import java.util.logging.Logger;

public class HW_Task2 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(HW_Task2.class.getName());
        int [] mas = {11, 3, 14, 16, 7};
        System.out.println("Source array:");
        System.out.println(Arrays.toString(mas));
 
        boolean isSorted = false;
        int buf;
        int count = 0;
        while(!isSorted) {
            count++;
            isSorted = true;
            for (int i = 0; i < mas.length-1; i++) {
                if(mas[i] > mas[i+1]){
                    isSorted = false;
                    buf = mas[i];
                    mas[i] = mas[i+1];
                    mas[i+1] = buf;
                    logger.info(String.format("After %d pass: ", count));
                    System.out.println(Arrays.toString(mas));
                }
            }
        }
        System.out.println(Arrays.toString(mas));
    }
}