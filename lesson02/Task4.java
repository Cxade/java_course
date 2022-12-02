import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

// Напишите метод, который составит строку, состоящую из 100
// повторений слова TEST и метод, который запишет эту строку
// в простой текстовый файл, обработайте исключения.

// Первый вариант

// public class Task4 {
//     public static void main(String[] args) {
//         System.out.println(multiplyString("TEST"));
//         writeFile(multiplyString("TEST"));
//     }
//     public static String multiplyString(String str) {
//         StringBuilder builder = new StringBuilder();
//         for (int i = 0; i < 100; i++) {
//             builder.append(str);
//         }
//         return builder.toString();
//     }
//     public static void writeFile(String str){
//         try(FileWriter writer = new FileWriter("Task4_TEST", false))
//         {
//             writer.write(str);
//             writer.flush();
//         }
//         catch(IOException ex){
//             System.out.println(ex.getMessage());
//         }
//     }
// }

public class Task4 {
    public static void main(String[] args) throws IOException {
        writeStringIntoFile(generateTestString());
    }

    public static String generateTestString() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 100; i++) {
            sb.append("TEST");          
        }
        return sb.toString();
    }

    public static void writeStringIntoFile(String str) {
        String address = System.getProperty("user.dir").concat("/file.text");
        File file = new File(address);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write(str);
            System.out.println("Success!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}