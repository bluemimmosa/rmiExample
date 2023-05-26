
import java.rmi.RemoteException;

/**
 *
 * @author Niraj Khadka
 */
public class HelloImpl implements Hello {

    @Override
    public void display() throws RemoteException {
        System.out.println("This is a msg from Hello implementation.");
    }
    
}
