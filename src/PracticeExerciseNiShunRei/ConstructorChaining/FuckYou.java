package PracticeExerciseNiShunRei.ConstructorChaining;

public class FuckYou {

    String name, surname;
    int age;

    FuckYou(){
        this("NULL");
    }
    FuckYou(String name){
        this(name, "NIGGA");
    }
    FuckYou(String name, String surname){
        this(name, surname, 0);
    }
    FuckYou(String name, String surname, int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public void display(){
        System.out.println("Name: " + name + "\nSurname: " + surname + "\nAge: " + age);
        System.out.println("\n====================================");
    }

}
