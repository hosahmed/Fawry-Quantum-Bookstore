
public class Main {
    public static void main(String[] args) {
        BookStore store = new BookStore();

        store.addBook(new PaperBook("1", "Test Book 1", 2010, 150, "Hossam", 5));
        store.addBook(new PaperBook("2", "Test Book 2", 2018, 180, "Ahmed", 2));
        store.addBook(new EBook("3", "Test Book 3", 2022, 90, "Mohamed", "zip"));
        store.addBook(new ShowcaseBook("4", "Test Book 4", 2000, "Tag"));

        System.out.println("\nTest Buying PaperBook:");

        try {
            double total = store.buyBook("1", 2, "test@gmail.com", "Nasr City");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\nTest Buying EBook:");
        try {
            double total = store.buyBook("3", 1, "test@gmail.com", "Nasr City");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\nTest Buying ShowcaseBook:");
        try {
            store.buyBook("4", 1, "test@gmail.com", "Nasr City");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\nTest Buying a nonexistent book:");
        try {
            store.buyBook("9", 1, "test@gmail.com", "Nasr City");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\nTest Buying Book out of stock:");
        try {
            store.buyBook("2", 3, "test@gmail.com", "Nasr City");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\nTest Removing old stock:");
        for (Book removed : store.removeOutdatedBooks(10, 2025)) {
            System.out.println("removed: " + removed.getTitle());
        }
    }
}