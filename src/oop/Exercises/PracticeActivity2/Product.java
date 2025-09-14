package oop.Exercises.PracticeActivity2;

public class Product {
    private int  id;
    private String name;
    private float price;

    //setter
    public void setId(int id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setPrice(float price){
        this.price = price;
    }
    //getter
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public float getPrice(){
        return price;
    }

    Product(){
        this(0);
    }
    Product(int id){
        this(id, "NO NAME", 0);
    }
    Product(int id, String name, float price){
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public void displayInfo(){
        System.out.println("\n==== PRODUCT INFO ====");
        System.out.println("Product ID: " + id);
        System.out.println("Product Name: " + name);
        System.out.println("Product Price: " + price);
    }



}
