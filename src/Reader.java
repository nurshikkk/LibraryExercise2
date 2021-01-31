import Interfaces.AdministratorInt;
import Interfaces.ReaderInt;

public class Reader implements ReaderInt {
    @Override
    public void takeBookFrom(AdministratorInt administrator) {
        System.out.println("You have taken a book");
    }
}