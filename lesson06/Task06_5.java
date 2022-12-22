import java.time.LocalDate;
import java.time.Month;

public class Task06_5 {
    public static void main(String[] args) {
        Cat_exh tom = new Cat_exh("Tom", "Homemade", "Blue", LocalDate.of(2020, Month.AUGUST, 9), "Denis");
        tom.addAward(new Award("Best color", "1st", 2022));
        tom.addAward(new Award("Best cat", "2nd", 2022));
        System.out.println(tom);

        Cat_exh barsik = new Cat_exh("Barsik", "Siberian", "Grey", LocalDate.of(2020, Month.FEBRUARY, 3), "Roman");
        barsik.addAward(new Award("Континентальный чемпион", "1st", 2023));
        barsik.addAward(new Award("Гранд чемпион", "2nd", 2022));
        System.out.println(barsik);


        System.out.println("===================================");

        KuklachevCats cat1 = new KuklachevCats("Мурзик", "Сибирская", "Серо-голубой", LocalDate.of(2019, Month.JANUARY, 7));
    
        cat1.addTrick(new Action("Кататься на велосипеде", "Юрий"));
    
        KuklachevCats cat2 = new KuklachevCats("Павел Иванович", "Мэйнкун", "Рыжий", LocalDate.of(2018, Month.APRIL, 7));
        cat2.addTrick(new Action("Ходить на передних лапах", "Юрий"));
        
        System.out.println(cat1);
        System.out.println(cat2);
    }
}
