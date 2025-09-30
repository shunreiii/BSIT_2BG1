package oop.Exercises.PracticeActivty3;

public class Electronics extends Product {
    public Electronics(String name, double price) {
        setName(name);
        setPrice(price);
    }

    @Override
    public double calculateFinalPrice() {
        return setPrice(getPrice() + (getPrice() * 0.1));
    }
}
