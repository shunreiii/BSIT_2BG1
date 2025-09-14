package dsa.Cruz_Shaun;
import java.util.Scanner;

public class review {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num, num2, equal;
        String operation;

        System.out.println("Enter first number: ");
        num = scan.nextInt();
        System.out.println("Enter second number: ");
        num2 = scan.nextInt();
        System.out.println("Enter operation: ");
        operation = scan.nextLine();

        switch (operation) {
            case "1":
                System.out.println("The sum is: " + (num + num2) + ".");
                break;

            case "2":
                System.out.println("The product is: " + (num * num2) + ".");
                break;

            case "3":
                System.out.println("The difference is: " + (num - num2) + ".");
                break;

            case "4":
                System.out.println("The quotient is: " + (num / num2) + ".");
                break;
        }

    }//psvm
}//Public class
