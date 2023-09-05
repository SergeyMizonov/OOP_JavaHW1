package Lesson1;

public class Chocolate extends Product {

    private double calories;

    public Chocolate (String name, String brand, double price, double calories ) {
        super(name, brand, price);
        this.calories = calories;

}

    public double getCalories() {
        return calories;
    }
    public String displayInfo(){

        return String.format("[Шоколад] %s - %s - %.2f - с: %.2f", name, brand, price, calories);

    }
}


