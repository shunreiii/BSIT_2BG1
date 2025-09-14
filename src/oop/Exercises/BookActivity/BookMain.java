package oop.Exercises.BookActivity;
import java.util.Scanner;

public class BookMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Book book = new Book("Ang Alamat ng Java", "J.S. Castillo", 0);

        System.out.println("=== Book Details ===");
        book.getBookDetails();

        while(true) {
            System.out.print("Enter page # (otherwise, press 0 to end): ");
            int choice = scan.nextInt();

            if (choice != 0) {
                book.updatePages(choice);
            } else{
                System.exit(0);
            }
        }

    }
}

class Book{
    String title, author;
    int pages;

    Book(String title, String author, int pages){
        if (pages <= 0){
            pages = 1;
            this.title = title;
            this.author = author;
            this.pages = pages;
        }
    }

    void getBookDetails(){
//        return "Title: " + this.title + "\nAuthor: " + this.author + "\nPages: " + this.pages + "\n";
        System.out.println("Title: " + this.title + "\nAuthor: " + this.author + "\nPages: " + this.pages + "\n");
    }

    int updatePages(int newPages){
        if (newPages < 0){
            System.out.println("\nUpdating page to " +  newPages + "...");
            System.out.println("Invalid page number. Must be higher than 0.\n");
        } else{
        this.pages = newPages;

            System.out.println("\nUpdating pages to " + newPages + "...");
            System.out.println("Pages updated successfully.\n");
        }

        System.out.println("=== Updated Book Details ===");
        getBookDetails();
        return newPages;
    }

}
