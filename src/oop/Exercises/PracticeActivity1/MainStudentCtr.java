package oop.Exercises.PracticeActivity1;
import java.util.Scanner;

public class MainStudentCtr {
    static int ctr = 0;//Variable of type int to keep track of the number of students added.

    public static void main(String[] args) {
        StudentCtr s1 = new StudentCtr("N/A", "N/A", 0); //Mainly used for the whole process
        Scanner scan = new Scanner(System.in);

        while(true){
            s1.showMenu();
            int choice = scan.nextInt();

            scan.nextLine();
            switch(choice){
                case 1:
                    System.out.println("\n===== ADD STUDENT INFO ====");
                    System.out.print("Enter Student's NAME: ");
                    String name = scan.nextLine();
                    System.out.print("Enter Student's COURSE: ");
                    String course = scan.nextLine();
                    System.out.print("Enter Student's ID: ");
                    int id = scan.nextInt();

                    s1.addStudentInfo(name, course, id);
                    ctr++;

                    System.out.println("""
                            \n===========================
                            Student Added Successfully!
                            ===========================\n""");
                    break;

                case 2:
                    System.out.println("""
                            \n===========================
                              DISPLAYING STUDENT INFO
                            ===========================""");
                    s1.displayInfo();
                    break;

                case 3:
                    showTotalStudents();
                    break;

                case 4:
                    System.out.println("""
                            \n===========================
                                 REMOVING A STUDENT
                            ===========================""");
                    for (int i = 0; i < s1.arName.size(); i++) {
                        System.out.println((i+1) + ". " + s1.arName.get(i) + " (" + s1.arId.get(i) + ")");
                    }

                    System.out.print("\nEnter the number of the student to remove (EX. \"1\"): ");
                    int index = scan.nextInt();
                    s1.arName.remove(index - 1);
                    s1.arCourse.remove(index - 1);
                    s1.arId.remove(index - 1);
                    ctr--;
                    System.out.println("Student Removed Successfully!");
                    break;

                case 0:
                    System.out.println("""
                    \n============================
                              Exiting...
                    ============================""");
                    System.exit(0);
            }//End of Switch
        }//End of While

    }//End of main

    static void showTotalStudents(){//Used to display the total number of students added.
        System.out.println("\n========================\nTotal # of Students: " + ctr + "\n========================\n");
    }

}//Public class

/*
Create a java program that keeps track of the number of students registered
in a system.

+ Each student should have: name, idNumber, and course (Instance Variable)
+ The program should count how many students have been created using
  static variable.
+ Use a constructor to initialize each student's details.
+ Use the 'this' keyword to assign values inside the constructor.
+ Create a method displayInfo() to show student's details.
+ Create a static method to displayTotalStudents() to show how many students
  are registered.
 */