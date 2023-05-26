
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author Niraj Khadka
 */
public class ClientProg {
    public ClientProg(){
        
    }
    public static void main(String[] args) {
        try{
            Registry registry = LocateRegistry.getRegistry(null);
            Hello stub = (Hello)registry.lookup("ServerObject");
            stub.display();
        }catch(Exception e){
            System.out.println("Client error:");
            e.printStackTrace();
        }
    }
    
}
