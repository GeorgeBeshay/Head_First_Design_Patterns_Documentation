package Ch04_TheFactoryPattern;

public class ChicagoPizzaStore extends PizzaStore{
    public ChicagoPizzaStore(){
        super("Chicago Pizza Store");
    }
    @Override
    protected Pizza createPizza(String type) {
        if(type.compareToIgnoreCase("Cheese") == 0)
            return new ChicagoStyleCheesePizza();
        else
            return null;
    }
}
