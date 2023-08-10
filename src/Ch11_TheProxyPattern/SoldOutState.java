package Ch11_TheProxyPattern;

import java.io.Serial;

public class SoldOutState implements State {
    @Serial
    private static final long serialVersionUID = 2L;
    transient GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Sorry .. The Machine is out of gumballs");
    }
    @Override
    public void ejectQuarter() {
        System.out.println("No quarter was inserted to eject it");
    }
    @Override
    public void turnCrank() {
        System.out.println("You've turned the crank, but the machine has no gumballs");
    }
    @Override
    public void dispense() {
        System.out.println("No gumball dispensed");
    }
}
