package dsa.Quiz1;
import java.util.ArrayList;
import java.util.Scanner;

public class ContactListManager {
    public static void main(String[] args) {
        ArrayList<String> arStr = new ArrayList<>();
        Scanner scan  = new Scanner(System.in);

        System.out.print("Enter the names of 5 contacts: \n");
        for (int i = 0; i < 5; i++) {
            System.out.print("Contact " +  (i + 1) + ": ");
            arStr.add(scan.nextLine());
        }

        System.out.println();
        System.out.println("Current Contact List:");
        for (int i = 0; i < arStr.size(); i++) {
            System.out.println((i+1) + ". " +  arStr.get(i));
        }

        System.out.println();
        System.out.print("Enter the name of the contact to remove: ");
        String name = scan.nextLine();
        System.out.println(name + " has been removed from the contact list.");
        arStr.remove(name);

        System.out.println();
        System.out.println("Updated Contact List:");
        for (int i = 0; i < arStr.size(); i++) {
            System.out.println((i+1) + ": " +  arStr.get(i));
        }

    }
}
