package oop.Exercises.Polymorphism;

public class Cat extends Animal {

    Cat(String name){
        super(name);
    }

    @Override
    void makeSound(){
        System.out.println("Cat says meow");
    }

    void eat(){
        System.out.println("Eat fish");
    }

}
