package oop.Exercises.StudentExample;

public class Student {
    //ATTRIBUTE
    private String name;
    private int id;
    private String course;

    Student(String name, int id, String course){ // CONSTRUCTOR
        this.name = name;
        this.id = id;
        this.course = course;
    }
    //GETTER AND SETTERS (encapsulation)
    public String getCourse() {
        return course;
    }
    public void setCourse(String course) {
        this.course = course;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void display(){
        System.out.println("\nName: " + name + "\nID: " + id + "\nCourse: " + course);
    }
}
