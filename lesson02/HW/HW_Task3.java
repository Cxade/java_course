// В файле содержится строка с данными:

// [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"}, {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"}, {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]

// Напишите метод, который разберёт её на составные части и, используя StringBuilder создаст массив строк такого вида:

// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.

package HW;

import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;
import javax.security.auth.Subject;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;

public class HW_Task3 {
    public static void main(String[] args) throws Exception {
        divStr();
    }

    public static void divStr() throws Exception {
        InputStreamReader fr = new InputStreamReader(new FileInputStream("dop_task3.txt"), "UTF-8");
        Scanner scan = new Scanner(fr);
        StringBuilder builder = new StringBuilder();
        String[] words = scan.nextLine().replaceAll("[{|}|\"| ]", "").split(",");
        fr.close();
        scan.close();

        String name = "";
        String grade = "";
        String subject = "";
        int count = 0;
        for (String word : words) {
            String[] keyValue = word.split(":");
            if (count == 0){
                name = keyValue[1];
                count++;
                continue;
            }
            if (count == 1){
                grade = keyValue[1];
                count++;
                continue;
            }
            if (count == 2){
                subject = keyValue[1];
                count = 0;
                builder.append(String.format("Студент %s получил %s по предмету %s.\n", name, grade, subject));
            }
        }
        System.out.println(builder.toString());
    }
}