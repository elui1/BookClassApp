public class Book {
    private String SKU;
    private String title;
    private String author;
    private String description;
    private double price;
    private boolean isInStock;

    public Book() {

    }

    public Book(String SKU) {
        this.SKU=SKU;

    }

    public Book(String SKU, String title, String author, String description, double price,
                boolean isInStock) {
        this.SKU = SKU;
        this.title = title;
        this.author = author;
        this.description = description;
        this.price = price;
        this.isInStock = isInStock;
    }

    public String getSKU() {
        return SKU;
    }

    public void setSKU(String SKU) {
        this.SKU = SKU;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isInStock() {
        return isInStock;
    }

    public void setInStock(boolean inStock) {
        isInStock = inStock;
    }

    public void getDisplayText() {
        System.out.println("The author is: " + author);
        System.out.println("The title is: " + title);
        System.out.println("The description is: " + description);
    }
}
