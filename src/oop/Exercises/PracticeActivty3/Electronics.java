package oop.Exercises.PracticeActivty3;

public class Electronics extends Product {

    Electronics(String name, int price) {
        super(name, price);
    }

    @Override
    public double calculateFinalPrice() {
        return setPrice(getPrice() + (getPrice() * 0.1));
    }
}
