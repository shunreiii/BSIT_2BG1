package dsa.Midterms;
import java.util.Scanner;

public class LinkedMain {
    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();
        Scanner scan = new Scanner(System.in);

        while(true){
            System.out.print("Enter name to be added in the list: ");
            String name = scan.nextLine();
            list.addHeads(name);

            System.out.print("Do you want to add another? y/n: \t");
            String choice  = scan.nextLine();
            if(choice.equalsIgnoreCase("n")){
                break;
            }
        }

        System.out.println("Linked List Names:");
        list.display();
        System.out.println();
        System.out.print("Replacing the third name with: ");
        String replace = scan.nextLine();
        list.replace(replace, 2);
        System.out.println("Linked List after replacement:");
        list.display();
    }
}
