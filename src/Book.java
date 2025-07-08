public abstract class Book {
    private String isbn;
    private String title;
    private int year;
    private double price;
    private String author;

    public Book(String isbn, String title, int year, double price, String author) {
        this.isbn = isbn;
        this.title = title;
        this.year = year;
        this.price = price;
        this.author = author;
    }

    public String getIsbn() { return isbn; }

    public int getYear() { return year; }

    public double getPrice() { return price; }

    public abstract boolean isForSale();

    public abstract void deliver(String email, String address);

    public abstract boolean hasStock(int quantity);

    public abstract void reduceStock(int quantity);

    public String getTitle() {
        return title;
    }
}
