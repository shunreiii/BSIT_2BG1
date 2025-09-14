package oop.Exercises.Inheritance;

public class Main {
    public static void main(String[] args) {
        Baby b = new Baby();

        Employee emp = new Employee();
        emp.name = "juan";
        emp.age = 25;

        b.displayInfo();
        emp.displayInfo();


    }
}
