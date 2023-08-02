import java.util.*;
public class Task {
    public static void main(String[] args) {
        Set<Laptop> laptops = new HashSet<>();

            Laptop laptop1 = new Laptop("Acer Aspire", 8, 512, "Windows", "Черный");
            Laptop laptop2 = new Laptop("Apple MacBook Pro", 16, 1024, "MacOS", "Серебро");
            Laptop laptop3 = new Laptop("Asus", 8, 256, "Linux", "Черный");
            Laptop laptop4 = new Laptop("Apple MacBook Air ", 8, 512, "macOS", "Золото");

            laptops = new HashSet<>();
            laptops.add(laptop1);
            laptops.add(laptop2);
            laptops.add(laptop3);
            laptops.add(laptop4);
            System.out.println(laptops);
        

        Map<Integer, Object> criteria = requestCriteria();

        List<Laptop> filteredNotebooks = Laptop.filterLaptops(laptops, criteria);
        for (Laptop laptop : filteredNotebooks) {
            System.out.println(laptop.getModel());
        }
    }

    public static Map<Integer, Object> requestCriteria() {
        Map<Integer, Object> criteria = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        
        boolean completeEnter = false;
        while (!completeEnter) {
            System.out.println("Введите цифру, соответствующую критерию фильтрации:");
            System.out.println("1 - ОЗУ");
            System.out.println("2 - Объем ЖД");
            System.out.println("3 - Операционная система");
            System.out.println("4 - Цвет");
            System.out.println("0 - Завершить ввод критериев");

            int selectedCriteria = scanner.nextInt();
            if (selectedCriteria == 0) {
                completeEnter = true;
            } else {
                System.out.println("Введите минимальное значение для выбранного критерия:");
                Object meaning = null;

                switch (selectedCriteria) {
                    case 1: 
                    meaning = scanner.nextInt();
                        break;
                    case 2: 
                    meaning = scanner.nextInt();
                        break;
                    case 3: 
                    case 4: 
                        scanner.nextLine();
                        meaning = scanner.nextLine();
                        break;
                    default:
                        break;
                }

                criteria.put(selectedCriteria, meaning);
            }
        }

        return criteria;
    }
}