package Ch12_CompoundPatterns;

public class DuckSimulator_2
{
    public static void main(String[] args) {
        (new DuckSimulator_2()).simulate();
    }
    private void simulate(){
        Quackable[] quackables = {
                new QuackCounter(new MallardDuck()),
                new QuackCounter(new RedheadDuck()),
                new QuackCounter(new DuckCall()),
                new QuackCounter(new RubberDuck()),
                new GooseAdapter(new Goose())
        };

        System.out.println("Duck Simulator: With Goose Adapter");
        for(Quackable quackable : quackables)
            simulate(quackable);
        System.out.println("The ducks quacked: " + QuackCounter.getNumberOfQuacks() + " times");
    }

    private void simulate(Quackable duck){
        duck.quack();
    }
}
