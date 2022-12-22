import java.util.*;

public class Task06_1 {
    public static void main(String[] args) {
        System.out.println(new HashSet<>(Arrays.asList(6, 5, 1, 2, 3, 2, 4, 6, 5, 3)));
        // Set<Integer> hashset = new HashSet<>(Arrays.asList(1, 2, 3, 2, 4, 6, 5, 3));
        // System.out.println(hashset);

        System.out.println(new TreeSet<>(Arrays.asList(6, 5, 1, 2, 3, 2, 4, 6, 5, 3)));

        System.out.println(new LinkedHashSet<>(Arrays.asList(6, 5, 1, 2, 3, 2, 4, 6, 5, 3)));
    }
}
