package Ch11_TheProxyPattern;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Client {
    public static void main(String[] args) throws MalformedURLException, NotBoundException, RemoteException {
        ServiceIF service = (ServiceIF) Naming.lookup("rmi://localhost:5099/theService");
        System.out.println(">>> " + service.echo("Salut!") );
    }
}
