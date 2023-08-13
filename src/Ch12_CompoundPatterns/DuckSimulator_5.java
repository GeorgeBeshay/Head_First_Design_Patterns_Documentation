package Ch12_CompoundPatterns;

public class DuckSimulator_5
{
    public static void main(String[] args) {
        (new DuckSimulator_5()).simulate(new CountingDuckFactory());
    }
    private void simulate(AbstractDuckFactory duckFactory){
        System.out.println("Duck Simulator: With Observer");

        Flock flockOfDucks = new Flock();

        flockOfDucks.add(duckFactory.createRedheadDuck());
        flockOfDucks.add(duckFactory.createDuckCall());
        flockOfDucks.add(duckFactory.createRubberDuck());
        flockOfDucks.add(new GooseAdapter(new Goose()));

        Flock flockOfMallards = new Flock();
        flockOfMallards.add(duckFactory.createMallardDuck());
        flockOfMallards.add(duckFactory.createMallardDuck());
        flockOfMallards.add(duckFactory.createMallardDuck());
        flockOfMallards.add(duckFactory.createMallardDuck());

        flockOfDucks.add(flockOfMallards);

        Quackologist quackologist = new Quackologist();
        flockOfDucks.registerObserver(quackologist);

        System.out.println("\nDuck Simulator: Whole Flock Simulation");
        simulate(flockOfDucks);

        System.out.println("\nThe ducks quacked: " + QuackCounter.getNumberOfQuacks() + " times");
    }

    private void simulate(Quackable duck){
        duck.quack();
    }
}
