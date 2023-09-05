package Lesson1;

public class Product {
    protected String name;
    protected String brand;
    protected double price;



    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 100) {
           throw new RuntimeException("Некорректная цена товара");
        }

        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        checkBrand(brand);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        checkName(name);
    }

    public Product(){
        this("Noname");
    }

    public Product(String name){
        this(name, "Noname");
    }

    public Product(String name, String brand){
        this(name, brand, 100);
    }

    public Product(String name, String brand, double price) {
        if (price < 100) {
        throw new RuntimeException("Некорректная цена товара");
        }
        this.price = price;
        checkName(name);
        checkBrand(brand);
    }

       private void checkName (String name){
            if (name == null || name.length() < 3) {
                this.name = "Noname";
            } else {
                this.name = name;
            }
        }
       private void checkBrand (String brand){
            if (brand == null || brand.length() < 3) {
                this.brand = "Noname";
            } else {
                this.brand = brand;
            }
    }




//        this.name = name;
//        this.brand = brand;
//        this.price = price;
//    }


    public String displayInfo(){

        return String.format("%s - %s - %.2f", name, brand, price);
    }
}
