package oop.Exercises.PracticeActivity2;

public class ProductMain {
    public static void main(String[] args) {

        Product p1 = new Product();
        Product p2 = new Product(1001);
        Product p3 = new Product(1002, "Orange", 15.09F);


        p1.displayInfo();

        p1.setId(1003);
        p1.setName("Grapes");
        p1.setPrice(16.69F);

        System.out.println("\n==== PRODUCT INFO ====\nProduct ID: " + p1.getId());
        System.out.println("Product Name: " + p1.getName());
        System.out.println("Product Price: " + p1.getPrice());

        p2.displayInfo();
        p3.displayInfo();
    }
}
