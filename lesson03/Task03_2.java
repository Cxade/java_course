import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Task03_2 {
    public static void main(String[] args) {
        // 1 ВАРИАНТ
        // List<String> list = new ArrayList<>();
        // list.add("Юпитер");
        // list.add("Земля");
        // list.add("Плутон");
        // list.add("Меркурий");
        // list.add("Марс");
        // list.add("Марс");
        // list.add("Юпитер");
        // int count = 0;
        // Collections.sort(list);
        // for (int i = 0; i < list.size(); i++) {
        //     count += 1;
        //     if ((i + 1) == list.size() || !list.get(i).equals (list.get(i+1))) {
        //         System.out.println(list.get(i) + " " + count);
        //         count = 0;
        //     }
        // }
        // 2 ВАРИАНТ

        
        List<String> list = new ArrayList<>();
        list.add("Юпитер");
        list.add("Земля");
        list.add("Плутон");
        list.add("Меркурий");
        list.add("Марс");
        list.add("Марс");
        list.add("Юпитер");

        list.sort(new Comparator<String>() {
           @Override
           public int compare(String o1, String o2) {
                return o1.compareTo(o2);
           } 
        });
        int count = 1;
        // Collections.sort(list);
        for (int i = 0; i < list.size() - 1; i++) {
            String str = list.get(i);
            if (list.get(i).equals(list.get(i + 1))) {
                count++;
            } else {
                System.out.println(str + " " + count);
                count = 1;
            }
        }
        System.out.println(list.get(list.size() - 1) + " " + count);


        /*
        Пройти по списку из предыдущего задания и удалить повторяющиеся элементы
        */

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).equals(list.get(i - 1))) {
                list.remove(i);
                i--;
            }
        }
        System.out.println(list);




    }
    
}