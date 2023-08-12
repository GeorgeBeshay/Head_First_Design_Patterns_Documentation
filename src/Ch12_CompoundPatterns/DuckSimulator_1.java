package Ch12_CompoundPatterns;

public class DuckSimulator_1 {
    public static void main(String[] args) {
        (new DuckSimulator_1()).simulate();
    }
    private void simulate(){
        Quackable[] quackables = {
                new MallardDuck(),
                new RedheadDuck(),
                new DuckCall(),
                new RubberDuck(),
                new GooseAdapter(new Goose())
        };

        System.out.println("Duck Simulator: With Goose Adapter");
        for(Quackable quackable : quackables)
            simulate(quackable);
    }

    private void simulate(Quackable duck){
        duck.quack();
    }
}
