package Ch12_CompoundPatterns;

public class DuckSimulator {
    public static void main(String[] args) {
        (new DuckSimulator()).simulate();
    }
    private void simulate(){
        Quackable[] quackables = {
                new MallardDuck(),
                new RedheadDuck(),
                new DuckCall(),
                new RubberDuck()
        };

        System.out.println("Duck Simulator");
        for(Quackable quackable : quackables)
            simulate(quackable);
    }

    private void simulate(Quackable duck){
        duck.quack();
    }
}
