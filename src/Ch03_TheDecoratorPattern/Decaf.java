package Ch03_TheDecoratorPattern;

public class Decaf extends Beverage{
    public Decaf() {
        this.description = "Decaf Coffee";
    }
    public double cost() {
        return 1.05;
    }
}
