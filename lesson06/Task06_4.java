
import java.time.LocalDate;
import java.time.Month;

public class Task06_4 {
    public static void main(String[] args) {
        Cat_exh tom = new Cat_exh("Tom", "Homemade", "Blue", LocalDate.of(2020, Month.AUGUST, 9), "Denis");
        Cat_exh barsik = new Cat_exh("Barsik", "Siberian", "Grey", LocalDate.of(2020, Month.FEBRUARY, 3), "Roman");
        
        tom.addAward(new Award("Best color", "1st", 2022));
        tom.addAward(new Award("Best cat", "2nd", 2022));

        barsik.addAward(new Award("Континентальный чемпион", "1st", 2023));
        barsik.addAward(new Award("Гранд чемпион", "2nd", 2022));

        System.out.println(tom);
        System.out.println(barsik);
    }
}
