package oop.Cruz_shaun;
import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Student student = new Student();

        System.out.print("Enter StudentMain Name: ");
        student.Name =  sc.nextLine();
        System.out.print("Enter StudentMain Year Level: ");
        student.yrLv = sc.nextInt();

        student.stdnt();
    }
}
