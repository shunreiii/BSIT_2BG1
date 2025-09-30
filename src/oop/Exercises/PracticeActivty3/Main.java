package oop.Exercises.PracticeActivty3;

public class Main {
    public static void main(String[] args) {

        Electronics e =  new Electronics("Laptop", 55000);
        Clothing c = new Clothing("Uniqlo", 990);

        e.displayInfo();
        System.out.println("Final Price: " + e.calculateFinalPrice() + "\n");

        c.displayInfo();
        System.out.println("Final Price: " + c.calculateFinalPrice());

    }
}
