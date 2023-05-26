

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Niraj Khadka
 */
public class ServerProg extends HelloImpl{
    public ServerProg(){
        
    }
    
    public static void main(String[] args) {
        HelloImpl obj = new HelloImpl();
        try{
            Hello skeleton = (Hello)UnicastRemoteObject.exportObject(obj, 0);
            Registry registry = LocateRegistry.getRegistry();
            registry.bind("ServerObject", skeleton);
        }catch(Exception e){
            System.out.println("Error occured: ");
            e.printStackTrace();
        }
    }
}
