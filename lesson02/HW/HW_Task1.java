// В файле содержится строка с исходными данными в такой 
// форме: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
// Требуется на её основе построить и вывести на экран новую строку, в форме SQL запроса:
// SELECT * FROM students WHERE name = "Ivanov" AND country = "Russia" AND city = "Moscow";

// Для разбора строки используйте String.split. Сформируйте новую строку, используя StringBuilder.
// Значения null не включаются в запрос.



package HW;

import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;

public class HW_Task1 {
    public static void main(String[] args) throws Exception {
        divStr();
    }
    public static void divStr() throws Exception {
        FileReader fr = new FileReader("dop_task1.txt");
        Scanner scan = new Scanner(fr);
        StringBuilder builder = new StringBuilder();
        String[] words = scan.nextLine().replaceAll("[{|}|\"]", "").split(", ");
        fr.close();
        scan.close();

        for (String word : words) {
            String[] keyValue = word.split(":");
            String key = keyValue[0];
            String value = keyValue[1];
            if (value.equals("null"))
                continue;
            else
                builder.append (String.format(" AND %s = %s", key, value));
        }
        String request = builder.toString();
        request = request.substring(5);
        System.out.println(request);
    }

}