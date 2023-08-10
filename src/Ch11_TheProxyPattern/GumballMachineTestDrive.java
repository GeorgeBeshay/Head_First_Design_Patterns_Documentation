package Ch11_TheProxyPattern;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class GumballMachineTestDrive {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.createRegistry(1000);
            registry.rebind("alexGumballMachine", new GumballMachine("Alexandria", 10));
            registry.rebind("cairoGumballMachine", new GumballMachine("Cairo", 20));
            registry.rebind("luxorGumballMachine", new GumballMachine("Luxor", 15));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }
}
