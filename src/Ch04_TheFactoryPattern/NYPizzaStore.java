package Ch04_TheFactoryPattern;

public class NYPizzaStore extends PizzaStore{
    public NYPizzaStore(){
        super("NY Pizza Store");
    }
    @Override
    protected Pizza createPizza(String type) {
        if(type.compareToIgnoreCase("Cheese") == 0)
            return new NYStyleCheesePizza();
        else if(type.compareToIgnoreCase("Veggie") == 0)
            return new NYStyleVeggiePizza();
        else if(type.compareToIgnoreCase("Clam") == 0)
            return new NYStyleClamPizza();
        else if(type.compareToIgnoreCase("Pepperoni") == 0)
            return new NYStylePepperoniPizza();
        else
            return null;
    }
}
