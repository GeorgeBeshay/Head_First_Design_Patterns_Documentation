package Ch11_TheProxyPattern;

import java.io.Serial;

public class NoQuarterState implements State {

    @Serial
    private static final long serialVersionUID = 2L;
    transient GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You inserted a quarter");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }
    @Override
    public void ejectQuarter() {
        System.out.println("You haven't inserted a quarter");
    }
    @Override
    public void turnCrank() {
        System.out.println("You turned, but there's no quarter");
    }
    @Override
    public void dispense() {
        System.out.println("You need to pay first");
    }
}
