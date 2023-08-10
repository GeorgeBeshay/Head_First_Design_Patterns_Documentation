package Ch11_TheProxyPattern;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class GumballMonitorTestDrive {
    public static void main(String[] args) {
        String[] locations = {
                "rmi://localhost:1000/alexGumballMachine",
                "rmi://localhost:1000/cairoGumballMachine",
                "rmi://localhost:1000/luxorGumballMachine",
        };

        GumballMonitor[] monitors = new GumballMonitor[locations.length];

        for(int i = 0 ; i < locations.length ; i++){
            try {
                monitors[i] = new GumballMonitor((GumballMachineRemote) Naming.lookup(locations[i]));
                System.out.println(monitors[i]);
                System.out.println();
            } catch (NotBoundException | MalformedURLException | RemoteException e) {
                System.out.println(e.getMessage());
            }
        }

        for(GumballMonitor gumballMonitor : monitors)
            gumballMonitor.report();
    }
}
