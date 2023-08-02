import java.util.*;

public class Laptop {
    private String model;
    private int ram;
    private int railwayVolume;
    private String operatingSystem;
    private String color;

    public Laptop(String model, int ram, int railwayVolume, String operatingSystem, String color) {
        this.model = model;
        this.ram = ram;
        this.railwayVolume = railwayVolume;
        this.operatingSystem = operatingSystem;
        this.color = color;
    }

    // Геттеры и сеттеры для полей

    public String getModel() {
        return model;
    }

    public void setModel(String модель) {
        this.model = модель;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int озу) {
        this.ram = озу;
    }

    public int getRailwayVolume() {
        return railwayVolume;
    }

    public void setRailwayVolume(int operatingSystem) {
        this.railwayVolume = operatingSystem;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    
    public static List<Laptop> filterLaptops(Set<Laptop> laptops, Map<Integer, Object> criteria) {
        List<Laptop> result = new ArrayList<>();

        for (Laptop laptop : laptops) {
            boolean fits = true;

            for (Map.Entry<Integer, Object> entry : criteria.entrySet()) {
                int criterion = entry.getKey();
                Object meaning = entry.getValue();

                switch (criterion) {
                    case 1: // ОЗУ
                        if (laptop.getRam() < (int) meaning) {
                            fits = false;
                        }
                        break;
                    case 2: // Объем ЖД
                        if (laptop.getRailwayVolume() < (int) meaning) {
                            fits = false;
                        }
                        break;
                    case 3: // Операционная система
                        if (!laptop.getOperatingSystem().equals(meaning)) {
                            fits = false;
                        }
                        break;
                    case 4: // Цвет
                        if (!laptop.getColor().equals(meaning)) {
                            fits = false;
                        }
                        break;
                    default:
                        break;
                }

                if (!fits) {
                    break;
                }
            }

            if (fits) {
                result.add(laptop);
            }
        }

        return result;
    }
}