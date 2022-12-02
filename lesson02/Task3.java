// Напишите метод, который принимает на вход строку (String)
// и определяет является ли строка палиндромом (возвращает boolean значение).


public class Task3 {
    public static void main(String[] args) {
        String str = "1221";
        if (isPalindrome(str))
            System.out.println("Является палиндромом");
        else
            System.out.println("Не является палиндромом");
    }

    public static boolean isPalindrome(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)){
                return false;
            }
        }
        return true;
    }
}
