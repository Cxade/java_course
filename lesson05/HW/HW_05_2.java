import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
Пусть дан список сотрудников: Иван, Пётр, Антон и так далее.
Написать программу,которая найдет и выведет повторяющиеся имена
с количеством повторений. Отсортировать по убыванию популярности.
*/


public class HW_05_2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Иван");
        list.add("Иван");
        list.add("Петр");
        list.add("Антон");
        list.add("Иван");
        list.add("Антон");
        list.add("Антон");
        list.add("Иван");
        list.add("Петр");
        System.out.println(list);
        
        HashMap <String, Integer> employees = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            String human = list.get(i);
            if (employees.containsKey(human)) { 
                int amount = employees.get(human);
                amount++;
                employees.put(human, amount);
            } else {
                employees.put(human, 1);
            }       
        }
        System.out.println(employees);
    }
    
}