package oop.Exercises.PracticeActivty3;

public class Clothing extends Product {

    public Clothing(String name, double price) {
        setName(name);
        setPrice(price);
    }

    @Override
    public double calculateFinalPrice() {
        return setPrice(getPrice() - (getPrice() * 0.05));
    }
}
