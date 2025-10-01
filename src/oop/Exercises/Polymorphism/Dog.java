package oop.Exercises.Polymorphism;

public class Dog extends Animal {

    Dog(String name){
        super(name);
    }

   @Override
    void makeSound(){
        System.out.println("Dog says bark");
    }

    void eat(){
        System.out.println("Eat bones");
    }

}
