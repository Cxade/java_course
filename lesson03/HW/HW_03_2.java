/*
2. Пусть дан произвольный список целых чисел. Удалить из него чётные числа.
*/


package HW;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class HW_03_2 {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < 10; i++) {
            int num = random.nextInt(51);
            System.out.println(num);
            list.add(num);
        }

        for (int j = 0; j < list.size(); j++) {
            if (list.get(j) % 2 == 0){
                list.remove(j);
                j--;
            }     
        }
    System.out.println(list);
    }
}
