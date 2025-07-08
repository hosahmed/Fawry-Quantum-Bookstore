public class EBook extends Book {
    private String fileType;

    public EBook(String isbn, String title, int year, double price, String author, String fileType) {
        super(isbn, title, year, price, author);
        this.fileType = fileType;
    }

    @Override
    public boolean isForSale() {
        return true;
    }

    @Override
    public void deliver(String email, String address) {
        System.out.println("Quantum book store: Emailing ebook to " + email);
    }

    @Override
    public boolean hasStock(int quantity) {
        return true;
    }

    @Override
    public void reduceStock(int quantity) {
    }
}
