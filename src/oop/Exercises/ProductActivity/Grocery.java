package oop.Exercises.ProductActivity;

public class Grocery extends Product {
    String expirationDate;

    Grocery (String name, double price, String expirationDate){
        super(name, price);
        this.expirationDate = expirationDate;
    }

    @Override
    public double calculatePrice(){
        return getPrice() - (getPrice() * 0.05);
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Expiration Date: " + expirationDate);
    }
}
