package oop.Exercises.ProductActivity;

public class Clothings extends Product {
    String size;

    public Clothings(String name, double price, String size) {
        super(name, price);
        this.size = size;
    }

    @Override
    public double calculatePrice() {
        return getPrice() - (getPrice() * 0.1) + (getPrice() * 0.05);
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Size: " + size);
    }


}
