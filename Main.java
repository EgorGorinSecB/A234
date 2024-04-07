

import java.util.ArrayList;

abstract class PCComponent {
    String name;
    double price;

    public PCComponent(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}


class CPU extends PCComponent {
    public CPU(String name, double price) {
        super(name, price);
    }
}

class GPU extends PCComponent {
    public GPU(String name, double price) {
        super(name, price);
    }
}

class RAM extends PCComponent {
    public RAM(String name, double price) {
        super(name, price);
    }
}

class Storage extends PCComponent {
    public Storage(String name, double price) {
        super(name, price);
    }
}


class PCSetup {
    ArrayList<PCComponent> components = new ArrayList<>();
    String caseSize;
    boolean hasRGBLighting;
    boolean hasLiquidCooling;

    public void addComponent(PCComponent component) {
        components.add(component);
    }

    public double calculateTotalCost() {
        double total = 0;
        for (PCComponent component : components) {
            total += component.getPrice();
        }
        // Add premiums based on case size, RGB lighting, etc.
        return total;
    }
}


public class Main {
    public static void main(String[] args) {
        PCSetup setup1 = new PCSetup();
        setup1.addComponent(new CPU("Intel i9", 500));
        setup1.addComponent(new GPU("NVIDIA RTX 3080", 700));
        // Add more components and features

        System.out.println("Total cost: " + setup1.calculateTotalCost());
       
    }
}
