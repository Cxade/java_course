import java.util.Scanner;

import javax.swing.plaf.synth.SynthPasswordFieldUI;

/*
Реализовать консольное приложение, которое:
Принимает от пользователя и “запоминает” строки.
Если введено print, выводит строки в обратном порядке (первая введённая окажется последней выведенной).
Если введено revert, удаляет предыдущую введенную строку из памяти.
*/

public class Task_04_3 {
    // 1 вариант
    // public static void main(String[] args) {
    //     ArrayDeque<String> stack = new ArrayDeque<>();
    //     while (true) {
    //         String str = scannerText();
    //         if (str.equals("quit")) {
    //             break;
    //         }

    //         else if (str.equals("print")) {
    //             Object[] strings = stack.toArray();
    //             for (int i = strings.length - 1; i >= 0; i--) {
    //                 System.out.println(strings[i]);
    //             }
    //         }

    //         else if (str.equals("revert")) {
    //             System.out.println(stack.removeLast());
    //         } else {
    //             stack.add(str);
    //         }
    //         System.out.println(stack);
    //     }
    // }

    // public static String scannerText() {
    //     Scanner in = new Scanner(System.in);
    //     System.out.print("Введите сироку в формате text~num: ");
    //     String text = in.nextLine();
    //     return text;
    // }





    // Второй вариант
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new LinkedList<>();

        while(true) {
            System.out.println("enter text: ");
            String input = scanner.nextLine();

            String[] textAndNum = input.split("~");
            if (textAndNum[0].equals("quit"));{
                break;
            }
            if (textAndNum.length < 2) {
                System.out.println("incorrect input");
                continue;
            }
            int i = Integer.parseInt(textAndNum[1]);

            if (textAndNum[0].equals("print")){
                System.out.println(list.get(i));
                list.remove(i);
                continue;
            }

            list.add(i, textAndNum[0]);
            System.out.println(list);
        }
        scanner.close();
    }

}