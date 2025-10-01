package oop.Exercises.ProductActivity;

public class Electronics extends Product {
    String brand;

    Electronics(String name, double price, String brand) {
        super(name, price);
        this.brand = brand;
    }

    @Override
    public double calculatePrice(){
        return getPrice() + getPrice() * 0.1;
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Brand: " + brand);
    }
}
