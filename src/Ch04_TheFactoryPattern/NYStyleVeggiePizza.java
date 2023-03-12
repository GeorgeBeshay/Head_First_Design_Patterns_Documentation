package Ch04_TheFactoryPattern;

public class NYStyleVeggiePizza extends Pizza{
    public NYStyleVeggiePizza(){
        this.name = "NY Style Veggie Pizza";
        this.dough = "NY Style Veggie Pizza Dough";
        this.sauce = "NY Style Veggie Pizza Sauce";
        this.toppings.add("NY Style Veggie Pizza Topping");
    }
}
