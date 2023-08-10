package Ch11_TheProxyPattern;

import java.rmi.RemoteException;

public class GumballMonitor {
    GumballMachineRemote machine;

    public GumballMonitor(GumballMachineRemote machine) {
        this.machine = machine;
    }
    public void report(){
        try {
            System.out.println("Gumball Machine: " + machine.getLocation());
            System.out.println("Current Inventory: " + machine.getCount() + " gumballs.");
            System.out.println("Current State: " + machine.getState());
            System.out.println();
        } catch (RemoteException e){
            System.out.println(e.getMessage());
        }
    }
}
