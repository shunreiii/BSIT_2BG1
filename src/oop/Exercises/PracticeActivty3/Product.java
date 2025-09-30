package oop.Exercises.PracticeActivty3;
import java.text.DecimalFormat;

public abstract class Product {

    public void setName(String name) {
        this.name = name;
    }

    private String name;
    private double price;

    public double getPrice() {
        return price;
    }
    public double setPrice(double price) {
        this.price = price;
        return price;
    }

    public abstract double calculateFinalPrice();

    public void displayInfo(){
        DecimalFormat df = new DecimalFormat("#.00");
        String FormattedPrice = df.format(this.price);
        System.out.println("Product Name: " + name + " | Price: " + FormattedPrice);
    }
}
