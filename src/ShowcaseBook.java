public class ShowcaseBook extends Book {

    public ShowcaseBook(String isbn, String title, int year, String author) {
        super(isbn, title, year, 0, author);
    }

    @Override
    public boolean isForSale() {
        return false;
    }

    @Override
    public void deliver(String email, String address) {
        System.out.println("Quantum book store: This book is not for sale.");
    }

    @Override
    public boolean hasStock(int quantity) {
        return false;
    }

    @Override
    public void reduceStock(int quantity) {
        throw new UnsupportedOperationException("Quantum book store: Not for sale.");
    }
}
