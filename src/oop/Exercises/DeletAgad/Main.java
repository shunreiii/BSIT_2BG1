package oop.Exercises.DeletAgad;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Nigga niggs = new Nigga();

        niggs.displayInfo();
        while(true) {
            niggs.menu();
            System.out.print("Enter your choice: ");
            int choice = scan.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter acceleration speed: ");
                    int acc = scan.nextInt();
                    niggs.accelerate(acc);
                    break;

                case 2:
                    System.out.print("Enter breaking speed: ");
                    int brk = scan.nextInt();
                    niggs.brake(brk);
                    break;

                case 3:
                    niggs.displayInfo();
                    break;

                case 0:
                    System.exit(0);
            }//switch
        }//while

    }//psvm
}//class
