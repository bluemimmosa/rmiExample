
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Niraj Khadka
 */
public interface Hello extends Remote{
    public void display() throws RemoteException;
}
