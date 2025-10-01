package oop.Exercises.ProductActivity;

public class ProductTest {
    public static void main(String[] args) {
        Product e = new Electronics("Laptop", 50000, "Dell");
        Product g = new Grocery("Rice", 1500, "2026-1-1");
        Product c = new Clothings("Shirt", 900, "Medium");

        e.displayInfo();
        System.out.println("Final Price (with Tax): " + e.calculatePrice() + "\n");
        g.displayInfo();
        System.out.println("Final Price (with Discount): " + g.calculatePrice() + "\n");
        c.displayInfo();
        System.out.println("Final Price (with Discount + Service fee): " + c.calculatePrice());

    }
}

/*
This is an activity that scoped the encapsulation, inheritance, polymorphism, and abstract class.
 */
