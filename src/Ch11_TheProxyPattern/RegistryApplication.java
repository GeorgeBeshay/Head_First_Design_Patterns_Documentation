package Ch11_TheProxyPattern;

import java.net.MalformedURLException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RegistryApplication {
    public static void main(String[] args) throws RemoteException, MalformedURLException {
        Registry registry = LocateRegistry.createRegistry(5099);
        registry.rebind("theService", new ConcreteService());
    }
}
