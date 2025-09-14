package PracticeExerciseNiShunRei.E1_StudentGradeTracker;
import java.util.Scanner;

public class StudentGT {

    Scanner scan = new Scanner(System.in);

    private String name;
    private float percentage;

    StudentGT(String name, float percentage) {
        this.name = name;
        this.percentage = percentage;
    }

    public void displayMenu(){
        System.out.println("""
                ================== MAIN MENU ==================
                [1] Determine Student's Grade (Individual Only)
                [2] Grade Calculator
                [3] Exit Program
                """);
        System.out.print("Enter your Choice: ");
    }

    public void displayInfo(char lGrade){
        System.out.println("Name: " + this.name);
        System.out.println("Percentage: " + this.percentage);
        System.out.println("Equivalent Grade: " + lGrade + "\n");
    }

    public void getStudentInfo(String name, float grade){
        this.name = name;
        this.percentage = grade;
    }
}
