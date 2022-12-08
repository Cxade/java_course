import java.util.ArrayList;
import java.util.Scanner;

/*
Каталог товаров книжного магазина сохранен в виде двумерного списка List<ArrayList<String>> так,
что на 0-й позиции каждого внутреннего списка содержится название жанра, а на остальных
 позициях - названия книг. Напишите метод для заполнения данной структуры.
 */

public class Task03_4 {
    public static void main(String[] args) {

        ArrayList<ArrayList<String>> list = new ArrayList<>();

        // можно сделать циклом for (а может метод?)
        list.add(new ArrayList<String>());
        list.add(new ArrayList<String>());
        list.add(new ArrayList<String>());

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < list.size(); i++) { // номер жанра
            System.out.println("Пожалуйста введите жанр ");
            list.get(i).add(sc.nextLine());

            for (int j = 0; j < 5; j++) { // номер книги
                System.out.println("Пожалуйста введите название книги ");
                list.get(j).add(sc.nextLine());                
            }
        }
        sc.close();
        System.out.println(list);
    }

}
// list.get(i).get(j)
