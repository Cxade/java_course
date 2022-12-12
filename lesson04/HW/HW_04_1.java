/*
Пусть дан LinkedList с несколькими элементами.
Реализуйте метод, который вернет “перевернутый” список.
*/
import java.util.Iterator;
import java.util.LinkedList;

public class HW_04_1 {
    public static void main(String[] args) {

        LinkedList<String> fstList = new LinkedList<>();
        LinkedList<String> sndList = new LinkedList<>();

        fstList.add("a");
        fstList.add("b");
        fstList.add("c");
        fstList.add("d");

        Iterator<String> iterator = fstList.descendingIterator();

        while (iterator.hasNext()) {
            sndList.add(iterator.next());
        }
        
        System.out.println("Изначальный лист: " + fstList);
        System.out.println("Измененный лист: " + sndList);

    }
    
}