package oop.Exercises.Polymorphism;

public class Animal {
    String name;

    Animal(String name){
        this.name = name;
    }

    void makeSound(){
        System.out.println("Animal make sound");
    }

}