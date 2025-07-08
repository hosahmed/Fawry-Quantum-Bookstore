public class PaperBook extends Book {
    private int stock;

    public PaperBook(String isbn, String title, int year, double price, String author, int stock) {
        super(isbn, title, year, price, author);
        this.stock = stock;
    }

    @Override
    public boolean isForSale() {
        return true;
    }

    @Override
    public void deliver(String email, String address) {
        System.out.println("Quantum book store: Shipping paper book to " + address);
    }

    @Override
    public boolean hasStock(int quantity) {
        return stock >= quantity;
    }

    @Override
    public void reduceStock(int quantity) {
        if (!hasStock(quantity)) {
            throw new RuntimeException("Quantum book store: Not enough stock");
        }
        stock -= quantity;
    }
}
