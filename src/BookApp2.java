//Driver class for BookDB

import java.util.Scanner;

public class BookApp2 {
    public static void main(String[] args) {
        String title = "";
        String author = "";
        String description = "";
        boolean isInStock;
        Scanner sc = new Scanner(System.in);

        BookDB books = new BookDB();
       // Book book = new Book();
        System.out.print("Enter SKU: ");
        String SKU = sc.next();
        Book book1 = books.getBook(SKU);

//        System.out.println("Description: " + book1.getDescription() + "  Title: " + book1.getTitle());
        book1.getDisplayText();

    }
}

