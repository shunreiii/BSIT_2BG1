package oop.Exercises.Inherutance2;

public class MainVehicle {
    public static void main(String[] args) {
        Car car = new Car();
        car.setBrand("ATOYOT");
        car.setModel("Camry");
        car.setSn(2024100630);

        car.displayInfo();

        Motorcycle motorcycle = new Motorcycle();
        motorcycle.setBrand("BMW");
        motorcycle.setModel("Broom Broom");
        motorcycle.setSn(2024100730);

        motorcycle.displayInfo();
    }
}
