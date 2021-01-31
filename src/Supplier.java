import Interfaces.LibrarianInt;
import Interfaces.SupplierInt;

public class Supplier extends Administrator implements SupplierInt {
    @Override
    public void sendBooksTo(LibrarianInt librarian) {
        System.out.println("Delivering books...");
    }
}