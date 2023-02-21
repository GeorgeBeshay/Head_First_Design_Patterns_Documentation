package Ch03_TheDecoratorPattern;

public class Mocha extends CondimentDecorator{
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }
    public double cost() {
        return this.beverage.cost() + .20;
    }
    public String getDescription() {
        return this.beverage.getDescription() + ", Mocha";
    }
}
