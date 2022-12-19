import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;

public class Task05_3 {
    public static void main(String[] args) {
        String a = "a+(d*3)";
        System.out.println(isTruePlacement(a));
    }

    public static boolean isTruePlacement(String a) {
        ArrayDeque<Character> stack = new ArrayDeque<>();
        Map<Character, Character> dictionary = new HashMap<>();
        dictionary.put('(', ')');
        dictionary.put('[', ']');
        dictionary.put('{', '}');
        dictionary.put('<', '>');

        for (int i = 0; i < a.length(); i++) {
            // мы проверили что символ является открывающей скобкой
            if (dictionary.containsKey(a.charAt(i))) {
                stack.addFirst(a.charAt(i));
            }
            if (dictionary.containsValue(a.charAt(i))) {
                Character openBracket = stack.removeFirst();
                if (!dictionary.get(openBracket).equals(a.charAt(i))) {
                    return false;
                }
            }
        }
        if (stack.isEmpty()) {
            return true;
        } else {
            return false;
        }

    }

    // static boolean areBrackets Paired (String expression) {
    //     HashMap<Character, Character> openingToClosingBrackets = new HashMap<>();
    //     openingToClosingBrackets.put(key: '(', value: ')');
    //     openingToClosingBrackets.put(key: '[', value: ']');
    //     openingToClosingBrackets.put(key: '{', value: '}');
    //     openingToClosingBrackets.put(key: '<', value: '>');
        
    //     Deque<Character> bracketsInExpression = new ArrayDeque<>();
        
    //     for (int i = 0; i < expression.length(); i++) {
    //         if (openingToClosingBrackets.containsKey(expression.charAt(i))) {
    //             bracketsInExpression.addLast (expression.charAt(i));
    //         } else if (openingToClosingBrackets.containsValue (expression.charAt(i))) {
    //             if (bracketsInExpression.isEmpty()) return false;
    //             else if (expression.charAt(i) != openingToClosingBrackets.get(bracketsInExpression.getLast())) return false;
    //             bracketsInExpression.removeLast();
    //         }
    //     }
    //     return bracketsInExpression.isEmpty();
    // }
    //     static void printResult(String expression) {
    //         System.out.println(String.format(format: "%s; %s", expression, areBrackets Paired (expression) ? "true" : "false"));
    //     }
        
        
}
