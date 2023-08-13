package Ch12_CompoundPatterns;

public class DuckSimulator_3
{
    public static void main(String[] args) {
        (new DuckSimulator_3()).simulate(new CountingDuckFactory());
    }
    private void simulate(AbstractDuckFactory duckFactory){
        Quackable[] quackables = {
                duckFactory.createMallardDuck(),
                duckFactory.createRedheadDuck(),
                duckFactory.createDuckCall(),
                duckFactory.createRubberDuck(),
                new GooseAdapter(new Goose())
        };

        System.out.println("Duck Simulator: With Abstract Factory");
        for(Quackable quackable : quackables)
            simulate(quackable);
        System.out.println("The ducks quacked: " + QuackCounter.getNumberOfQuacks() + " times");
    }

    private void simulate(Quackable duck){
        duck.quack();
    }
}
