import Interfaces.LibrarianInt;
import Interfaces.SupplierInt;

public class Librarian implements LibrarianInt {
    @Override
    public void orderBookFrom(SupplierInt supplier) {
        System.out.println("Ordering book...");
    }
}