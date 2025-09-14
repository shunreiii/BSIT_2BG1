package PracticeExerciseNiShunRei.E1_StudentGradeTracker;
import java.util.Scanner;

public class StudentGTMain {
    public static void main(String[] args) {
        StudentGT s1 = new StudentGT("N/A", 0.00f);
        Scanner scan =  new Scanner(System.in);

        System.out.println("=== Welcome to Student Grade Tracker ===");

        while(true){
            s1.displayMenu();

            int choice =  scan.nextInt();
            scan.nextLine();
            switch (choice){
                case 1:
                    System.out.print("\nEnter Student Name: ");
                    String name = scan.nextLine();
                    System.out.print("Enter Student Grade: ");
                    float grade = scan.nextFloat();

                    System.out.println();
                    s1.getStudentInfo(name, grade);
                    s1.displayInfo(convertGradeToLetter(grade));
                    break;

                case 2:
                    System.out.print("Enter Student Name: ");
                    break;

                case 3:
                    System.exit(0);
            }
        }//End of while
    }//End of Main

    static char convertGradeToLetter(float percent){
        char grade = 'n';
        if (percent < 100  && percent >= 90 ){
            grade = 'a';
        } else if (percent < 90 && percent >= 80){
            grade = 'b';
        } else if (percent < 80 && percent >= 70){
            grade = 'c';
        }  else if (percent < 70 && percent >= 60){
            grade = 'd';
        } else {
            grade = 'f';
        }

        return Character.toUpperCase(grade);
    }

}
/*
Create a class that tracks individual student info and provides a utility
to convert percentage to letter grades.

Requirements:
Constructor
* Accepts name and percentage as parameters
* Initializes them as instance variables

Instance Variables
* Name
* Percentage

Static Method
convert_letter_to_grade(percentage):
* Converts a percentage to a letter using the following scale:
    * 90 and above = A
    * 80-89 = B
    * 70-79 = C
    * 60-69 = D
    * Below 60 = F

Instance Method
* displayInfo()
    * Prints student's name, percentage, and their corresponding letter
grade
*/