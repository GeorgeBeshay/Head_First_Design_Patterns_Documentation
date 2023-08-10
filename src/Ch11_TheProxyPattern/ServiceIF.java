package Ch11_TheProxyPattern;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ServiceIF extends Remote {
    String echo(String string) throws RemoteException;
}
