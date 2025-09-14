package oop.Exercises.Inherutance2;

public class Vehicle {
    private String brand;
    private String model;
    private int sn;

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setSn(int sn) {
        this.sn = sn;
    }
    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public int getSn() {
        return sn;
    }

    void displayInfo(){
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("SN: " + sn + "\n");
    }

}

class Car extends Vehicle{
    Car(){
        System.out.println("==== CAR ====");
    }
}

class Motorcycle extends Vehicle{

    Motorcycle(){
        System.out.println("==== MOTORCYCLE ====");
    }
}


