import Interfaces.AdministratorInt;
import Interfaces.LibrarianInt;
import Interfaces.ReaderInt;
import Interfaces.SupplierInt;

public class User implements AdministratorInt, ReaderInt, SupplierInt, LibrarianInt {
    @Override
    public void overdueNotification(ReaderInt reader) {
        System.out.println("Your book is overdued.");
    }

    @Override
    public void orderBookFrom(SupplierInt supplier) {
        System.out.println("Ordering book...");
    }

    @Override
    public void takeBookFrom(AdministratorInt administrator) {
        System.out.println("You have taken a book");
    }

    @Override
    public void sendBooksTo(LibrarianInt librarian) {
        System.out.println("Delivering books...");
    }
}