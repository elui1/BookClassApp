import java.util.ArrayList;
import java.util.Scanner;

public class BookApp {
    public static void main(String[] args) {
//        Book book1 = new Book();
//        book1.setTitle("Harry Potter");
//        book1.setAuthor("David Fotland");
//        book1.setDescription("Fantasy");
//        book1.setPrice(9.50);
//        book1.setInStock(true);

//        Book book2 = new Book("Sword of Truth", "Terry Goodkind",
//                "Epic fantasy");
//
//        book2.getDisplayText();
        String title = "";
        String author = "";
        String description = "";
        boolean isInStock;

        double totalPrice = 0.0;
        ArrayList<Book> books = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.print("How many books do you want to know the price of? ");
        int numBooks = sc.nextInt();

        for (int i = 0; i < numBooks; i++) {
            System.out.print("Book title: ");
            title = sc.next();
            sc.nextLine();

            System.out.print("Book author: ");
            author = sc.next();

            System.out.print("Book description: ");
            description = sc.nextLine();
            sc.nextLine();

            System.out.print("In stock: ");
            isInStock = sc.nextBoolean();

            books.add(new Book(title, author, description, isInStock));
            System.out.println();
        }

        for (int i = 0; i < numBooks; i++) {
            if (books.get(i).isInStock()) {
                books.get(i).setPrice(20.0);
                totalPrice += 20.0;
            }
            //System.out.print(getPrice(books.get(i)) + " " + books.get(i).getAuthor());
        }

        System.out.println("The total price is " + totalPrice);

    }

    public static double getPrice(Book book) {
        return book.getPrice();
    }

}
