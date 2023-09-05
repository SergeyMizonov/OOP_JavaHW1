package Lesson1;

public class BottleOfWater extends Product {
    private double volume;

    public BottleOfWater (String name, String brand, double price, double volume ) {
        super(name, brand, price);
        this.volume = volume;


    }

    public double getVolume() {
        return volume;
    }

    public String displayInfo(){

        return String.format("[Бутылка с водой] %s - %s - %.2f - v: v%.2f", name, brand, price, volume);

    }
}
