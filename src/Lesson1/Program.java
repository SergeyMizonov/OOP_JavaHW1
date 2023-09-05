package Lesson1;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        Product product1 = new Product();
        product1.name = "Product1";
        product1.brand = "Brand1";
        product1.price = 200;
        System.out.println(product1.displayInfo());

        Product product2 = new Product("null", "Brand2", 300);
        System.out.println(product2.displayInfo());
        product2.setPrice(400);
        double price = product2.getPrice();
        System.out.println(price);
        System.out.println(product2.displayInfo());

        Product product3 = new Product("Product3");
        System.out.println(product3.displayInfo());

        Product bottleOfMilk1 =
                new BottleOfMilk("Бутылка1", "ООО Молокозавод", 350, 1.5, 5);
        System.out.println(bottleOfMilk1.displayInfo());

        Product bottleOfWater1 =
                new BottleOfWater("Бутылка с водой", "ООО Источник", 350, 1);
        System.out.println(bottleOfWater1.displayInfo());

        Product bottleOfWater2 =
                new BottleOfWater("Бутылка с водой", "ООО Источник", 350, 1.5);
        Product bottleOfWater3 =
                new BottleOfWater("Бутылка с водой", "ООО Источник", 350, 2);
        Product Chocolate1 =
                new Chocolate("Mars", "Mars", 150, 200);
        Product Chocolate2 =
                new Chocolate("Snickers", "Mars", 170, 250);
        Product Chocolate3 =
                new Chocolate("Bounty", "Mars", 130, 150);
        Product Chocolate4 =
                new Chocolate("KitKat", "Nestle", 110, 120);

        List<Product> products = new ArrayList<>();
        products.add(bottleOfMilk1);
        products.add(bottleOfWater1);
        products.add(bottleOfWater2);
        products.add(bottleOfWater3);
        products.add(Chocolate1);
        products.add(Chocolate2);
        products.add(Chocolate3);
        products.add(Chocolate4);


        VendingMachine vendingMachine = new VendingMachine(products);
        BottleOfWater bottleOfWater = vendingMachine.getBottleOfWater("Бутылка с водой", 1.5);
        if (bottleOfWater != null) {
            System.out.println("Вы получили: ");
            System.out.println((bottleOfWater.displayInfo()));
        } else {
            System.out.println("Такой бутылки с водой нет в автомате");
        }

        Chocolate chocolate = vendingMachine.getChocolate("Bounty", 150);
        if (chocolate != null) {
            System.out.println("Вы получили: ");
            System.out.println((chocolate.displayInfo()));
        } else {
            System.out.println("Такой шоколадки нет в автомате");
        }
    }
}
