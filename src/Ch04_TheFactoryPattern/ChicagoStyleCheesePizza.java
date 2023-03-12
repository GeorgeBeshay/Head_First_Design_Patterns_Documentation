package Ch04_TheFactoryPattern;

public class ChicagoStyleCheesePizza extends Pizza{
    public ChicagoStyleCheesePizza(){
        this.name = "Chicage Style Deep Dish Cheese Pizza.";
        this.dough = "Extra Thick Crust Dough";
        this.sauce = "Plum Tomato Sauce";
        this.toppings.add("Shredded Mozzarella Cheese.");
    }
    @Override
    void cut(){
        System.out.println("Cutting the pizza into square slices ..");
    }
}
