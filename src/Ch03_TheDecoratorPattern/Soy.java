package Ch03_TheDecoratorPattern;

public class Soy extends CondimentDecorator{
    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }
    public double cost() {
        double cost = this.beverage.cost();
        if(this.beverage.getSize() == Size.Tall)
            cost += 0.1;
        else if(this.beverage.getSize() == Size.GRANDE)
            cost += 0.15;
        else if(this.beverage.getSize() == Size.VENTI)
            cost += 0.2;
        return cost;
    }
    public String getDescription() {
        return this.beverage.getDescription() + ", Soy";
    }
}
