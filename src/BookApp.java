public class BookApp {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.setTitle("Harry Potter");
        book1.setAuthor("David Fotland");
        book1.setDescription("Fantasy");
        book1.setPrice(9.50);
        book1.setInStock(true);

        System.out.println(book1.getTitle());
        System.out.println(book1.getAuthor());
        System.out.println(book1.getDescription());
        System.out.println(book1.getPrice());
        System.out.println(book1.isInStock());

        Book book2 = new Book("Sword of Truth", "Terry Goodkind",
                "Epic fantasy");

        book2.getDisplayText();


    }
}
