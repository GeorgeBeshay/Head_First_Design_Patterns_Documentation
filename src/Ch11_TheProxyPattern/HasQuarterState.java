package Ch11_TheProxyPattern;

import java.io.Serial;
import java.util.Random;

public class HasQuarterState implements State {
    @Serial
    private static final long serialVersionUID = 2L;
    transient GumballMachine gumballMachine;
    Random randomWinner = new Random(System.currentTimeMillis());

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can't insert another quarter");
    }
    @Override
    public void ejectQuarter() {
        System.out.println("Quarter returned");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }
    @Override
    public void turnCrank() {
        System.out.println("You turned ..");
        if(randomWinner.nextInt(10) == 0 && gumballMachine.getCount() > 1)
            gumballMachine.setState(gumballMachine.getWinnerState());
        else
            gumballMachine.setState(gumballMachine.getSoldState());
    }
    @Override
    public void dispense() {
        System.out.println("No gumball dispensed");
    }
}
