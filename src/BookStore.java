import java.util.*;

public class BookStore {
    private Map<String, Book> inventory = new HashMap<>();

    public void addBook(Book book) {
        inventory.put(book.getIsbn(), book);
    }

    public List<Book> removeOutdatedBooks(int yearsLimit, int currentYear) {
        List<Book> removed = new ArrayList<>();
        Iterator<Map.Entry<String, Book>> it = inventory.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry<String, Book> entry = it.next();
            if (currentYear - entry.getValue().getYear() > yearsLimit) {
                removed.add(entry.getValue());
                it.remove();
            }
        }

        return removed;
    }

    public double buyBook(String isbn, int quantity, String email, String address) {
        if (!inventory.containsKey(isbn)) {
            throw new RuntimeException("Quantum book store: Book not found");
        }

        Book book = inventory.get(isbn);

        if (!book.isForSale()) {
            throw new RuntimeException("Quantum book store: Book not for sale");
        }

        if (!book.hasStock(quantity)) {
            throw new RuntimeException("Quantum book store: out of stock");
        }

        book.reduceStock(quantity);
        book.deliver(email, address);
        return book.getPrice() * quantity;
    }
}
