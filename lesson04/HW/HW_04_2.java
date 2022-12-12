/*
Реализуйте очередь с помощью LinkedList со следующими методами:
enqueue() - помещает элемент в конец очереди, dequeue() - возвращает 
первый элемент из очереди и удаляет его, first() - возвращает первый элемент из очереди, не удаляя.
*/

import java.util.LinkedList;

public class HW_04_2 {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");

        System.out.println("Изначальный лист: " + list);

        // enqueue
        list.add("DA");
        System.out.println("лист (enqueue): " + list);

        // dequeue
        list.removeFirst();
        System.out.println("лист (dequeue): " + list);

        // first
        System.out.println("Первый элемент (first) не удаляя: " + list.getFirst());
        System.out.println("лист (first): " + list);
    }
}
