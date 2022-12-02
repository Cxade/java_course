import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.print.attribute.standard.Fidelity;

// Напишите метод, который вернет содержимое текущей папки в виде массива строк. 
// Напишите метод, который запишет массив, возвращенный предыдущим методом в файл. 
// Обработайте ошибки с помощью try-catch конструкции. В случае возникновения исключения, оно должно записаться в лог-файл.

public class Task5 {
    public static void main(String[] args) {
        String[] fileList = dirList("./");
        Logger logger = Logger.getLogger(Task5.class.getName());
        try {
            writeFile(fileList);
        }
        catch (IOException ex){
            logger.log(Level.SEVERE, "Error", ex);
        }
        catch (NullPointerException npe){
            logger.log(Level.SEVERE, "Error", npe);
        }
    }
    public static String[] dirList(String dir) {
        File file = new File(dir);
        String[] fileList = file.list();
        return fileList;
    }
    public static void writeFile(String[] str) throws IOException {
        try(FileWriter writer = new FileWriter("Task5_listOfFiles", false))
        {
            for (int i = 0; i < str.length; i++)
                writer.write(str[i] + "\n");
                writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        catch(NullPointerException ex){
            System.out.println(ex.getMessage());
        }
    }
}
