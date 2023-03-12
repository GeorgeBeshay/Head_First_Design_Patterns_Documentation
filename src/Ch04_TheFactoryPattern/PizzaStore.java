package Ch04_TheFactoryPattern;

public abstract class PizzaStore {
    String storeName;
    public PizzaStore(String storeName){
        this.storeName = storeName;
    }
    public Pizza orderPizza(String type){
        Pizza pizza;
        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
    protected abstract Pizza createPizza(String type);
}
