package Ch03_TheDecoratorPattern;

public class Whip extends CondimentDecorator{
    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }
    public double cost() {
        return this.beverage.cost() + .10;
    }
    public String getDescription() {
        return this.beverage.getDescription() + ", Whip";
    }
}
