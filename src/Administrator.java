import Interfaces.AdministratorInt;
import Interfaces.ReaderInt;

public class Administrator extends Librarian implements AdministratorInt {
    @Override
    public void overdueNotification(ReaderInt reader) {
        System.out.println("Your book is overdued.");
    }
}