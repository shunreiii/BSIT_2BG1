package oop.Exercises.StudentExample;


public class StudentMain {
    public static void main(String[] args) {

    Student std = new Student("N/A", 0, "N/A");
    Student std2 = new Student("Ja Be Gev", 2024567890, "BSIT");

    std.display(); // Displays the initial data

    // Changes the data of the student
    std.setName("Dan Tan Co");
    std.setId(2024123321);
    std.setCourse("BSIT");

    std.display(); // Displays info using the display method in Studen class

    // Uses the getter
    System.out.println("\n" + std.getName());
    System.out.println(std.getId());
    System.out.println(std.getCourse());

    // displays the data of std2
    std2.display();
    }
}


/*
String name1, name2;
int id1, id2;
String course1, course2;

name1 = "Ja Be Gev";
id1 = 2024567890;
course1 = "BSIT";

System.out.println("Name: " + name1 + " ID: " + id1 + " Course: " + course1 + ");

name2 = "Dan Tan Co";
id2 = 2024123321;
course2 = "BSIT";

System.out.println("Name: " + name2 + " ID: " + id2 + " Course: " + course2 + ");
 */







