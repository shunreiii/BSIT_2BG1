package oop.Exercises.ProductActivity;

public abstract class Product {
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }

    private String name;
    private double price;

    Product (String name, double price) {
        this.name = name;
        this.price = price;
    }

    public abstract double calculatePrice();

    public void displayInfo(){
        System.out.println("Product Name: " + name);
        System.out.println("Product Price: " + price);
    }

} //end of product class
