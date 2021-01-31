public class Main {
    public static void main(String[] args) {
        Administrator administrator = new Administrator();
        Reader reader = new Reader();
        Supplier supplier = new Supplier();
        Librarian librarian = new Librarian();

        administrator.overdueNotification(reader);
        reader.takeBookFrom(administrator);
        supplier.sendBooksTo(librarian);
        librarian.orderBookFrom(supplier);

        // Administrator is also a Librarian
        administrator.orderBookFrom(supplier);

        // Supplier is also an Administrator
        supplier.overdueNotification(reader);
    }
}