package oop.Exercises.PracticeActivity1;
import java.util.ArrayList;

public class StudentCtr {
    String name;
    String course;
    int id;

    ArrayList<String> arName = new ArrayList<>();
    ArrayList<String> arCourse = new ArrayList<>();
    ArrayList<Integer> arId = new ArrayList<>();

    StudentCtr(String name, String course, int id){
        this.name = name;
        this.course = course;
        this.id = id;
    }

    public void displayInfo(){
        if(arName.isEmpty()){
            System.out.println("---- STUDENT (" + (1) + ") ----");
            System.out.println("Student ID: " + this.id);
            System.out.println("Name: " + this.name);
            System.out.println("Course: " + this.course + "\n");
            System.out.println("No Students Added");
            return;
        }

        for(int i=0; i<arName.size(); i++){
            System.out.println("---- STUDENT (" + (i+1) + ") ----");
            System.out.println("Student ID: " + arId.get(i));
            System.out.println("Name: " + arName.get(i));
            System.out.println("Course: " + arCourse.get(i) + "\n");
        }
    }

    public void showMenu(){
        System.out.println("""
                ============ MAIN MENU ============
                [ 1 ] Add Student Info
                [ 2 ] Display Student Info
                [ 3 ] Show Number of Students Added
                [ 4 ] Remove a Student
                [ 0 ] Exit\n""");

        System.out.print("Enter your choice: ");
    }

    public void addStudentInfo(String name, String course, int id){
        arName.add(name);
        arCourse.add(course);
        arId.add(id);

        this.name = name;
        this.course = course;
        this.id = id;
    }



}
