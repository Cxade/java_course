import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/*
Реализуйте структуру телефонной книги с помощью HashMap,
учитывая,что один человек может иметь несколько телефонов.
*/



public class HW_05_1 {
    public static void main(String[] args) {
        HashMap <String, ArrayList<String>> book = new HashMap<>();
        // ArrayList<String> phone = new ArrayList<String>();
        
        book.put("Иванов Иван Иванович", new ArrayList<String>(Arrays.asList("+79116592121", "+71115592122")));
        book.put("Петров Роман Генадьевич", new ArrayList<String>(Arrays.asList("+79996595555")));
        book.put("Бурый Арсен Юрьевич", new ArrayList<String>(Arrays.asList("+79146667777", "+72345592150", "+72325392134")));
        book.put("Синий Дмитрий Анатольевич", new ArrayList<String>(Arrays.asList("+79118243176", "+79285598732")));
        System.out.println(book);
    }
}
