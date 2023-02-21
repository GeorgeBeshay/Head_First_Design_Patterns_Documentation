package Ch03_TheDecoratorPattern;

public class Soy extends CondimentDecorator{
    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }
    public double cost() {
        return this.beverage.cost() + .15;
    }
    public String getDescription() {
        return this.beverage.getDescription() + ", Soy";
    }
}
