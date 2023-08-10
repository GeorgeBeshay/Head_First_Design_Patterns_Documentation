package Ch11_TheProxyPattern;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ConcreteService extends UnicastRemoteObject implements ServiceIF {
    public ConcreteService() throws RemoteException {}

    @Override
    public String echo(String string) throws RemoteException {
        return "From Concrete Server: " + string;
    }
}
