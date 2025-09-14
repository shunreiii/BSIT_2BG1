package oop.Exercises.Inheritance;

public class Person {
    String name = "No Name", sex = "Unknown";
    int age = 0;

    void displayInfo(){
        System.out.println("Name: " + this.name);
        System.out.println("Gender: " + this.sex);
        System.out.println("Age: " + this.age);
    }
}
