import java.util.ArrayList;

public class BookDB {
    private ArrayList<Book> db = new ArrayList<>();

    public BookDB(String SKU) {


    }

    public ArrayList<Book> getDb() {
        return db;
    }

    public void setDb(ArrayList<Book> db) {
        this.db = db;
    }

    public Book getBook(String SKU) {
        if (SKU.equals("Java1001")) {
            db.add(new Book("Head First Java", "Kathy Sierra and Bert Bates",
                    "Easy to read Java workbook", 47.50));
        }
        else if (SKU.equals("Java1002")) {
            db.add(new Book("Thinking in Java", "Bruce Eckel",
                    "Details about Java under the hood", 20.00));
        }

        //db.add()
        //return db.get();
    }
}
