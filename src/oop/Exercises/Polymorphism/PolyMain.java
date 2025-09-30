package oop.Exercises.Polymorphism;

public class PolyMain {
    public static void main(String[] args) {
        Animal d = new Dog("Bantay");
        Animal c = new Cat("Muning");

        d.makeSound();
        c.makeSound();

        Dog dog = (Dog) d;//downcasting
        dog.eat();
    }
}