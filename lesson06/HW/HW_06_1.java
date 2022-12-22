package HW;

import java.util.*;

public class HW_06_1 {
    public static void main(String[] args) {
        Set<Laptop> laptops = new HashSet<>();
        laptops.add (new Laptop("Acer", "QE12345ER", 4, 128, "Windows home", "red"));
        laptops.add (new Laptop("Apple", "Apple MacBook Pro", 8, 512, "macOS", "white"));
        laptops.add (new Laptop("MSI", "OO475533LK", 8, 512, "Windows home", "black"));
        laptops.add (new Laptop("Lenovo", "ZR23345KJ", 16, 512, "Windows professional", "blue"));
        laptops.add (new Laptop("Huawei", "GE96623345ER", 8, 256, "Windows home", "white"));
        laptops.add (new Laptop("Xiaomi", "HG24552345ER", 8, 512, "Windows home", "black"));
        laptops.add (new Laptop("Lenovo", "ZR68345KJ", 32, 2048, "Windows professional", "black"));
    
        Map<String, String> filters = new HashMap<> ();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Здравствуйте! Хотите ли вы совершить поиск ноутбкука по параметрам?(y/n)");
        String a = scanner.nextLine();
        if (a.equals("y")) {
            System.out.println("Какой производитель?(если желаете не выбирать, то оставьте строку пустой)");
            filters.put("producer", scanner.nextLine());
            System.out.println("Какая модель?(если желаете не выбирать, то оставьте строку пустой)");
            filters.put("model", scanner.nextLine());
            System.out.println("Сколько оперативной памяти?(если желаете не выбирать, то оставьте строку пустой)");
            filters.put("ram", scanner.nextLine());
            System.out.println("Какой объем жесткого диска?(если желаете не выбирать, то оставьте строку пустой)");
            filters.put("hard_disk", scanner.nextLine());
            System.out.println("Какая операционная система?(если желаете не выбирать, то оставьте строку пустой)");
            filters.put("os", scanner.nextLine());
        }

        scanner.close ();

        List<Laptop> filtered = new ArrayList<>();
        for (Laptop laptop : laptops) {
            String filterProducer = filters.get("producer");
            if (filterProducer != "" && !filterProducer.equalsIgnoreCase(laptop.getProducer())){
                continue;
            }
            String filterModel = filters.get("model");
            if (filterModel != "" && !filterModel.equalsIgnoreCase(laptop.getModel())){
                continue;
            }
            String filterRam = filters.get("ram");
            if (filterRam != "" && !filterRam.equals(laptop.getRam().toString())){
                continue;
            }
            String filterHard_disk = filters.get("hard_disk");
            if (filterHard_disk != "" && !filterHard_disk.equals(laptop.getHard_disk().toString())){
                continue;
            }
            
            String filterOs = filters.get("os");
            if (filterOs != "" && !filterOs.equalsIgnoreCase(laptop.getOs())){
                continue;
            }

            filtered.add (laptop);
        }

        System.out.println(filtered);
    }
}
