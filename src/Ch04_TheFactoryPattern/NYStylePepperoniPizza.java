package Ch04_TheFactoryPattern;

public class NYStylePepperoniPizza extends Pizza{
    public NYStylePepperoniPizza(){
        this.name = "NY Style Pepperoni Pizza";
        this.dough = "NY Style Pepperoni Pizza Dough";
        this.sauce = "NY Style Pepperoni Pizza Sauce";
        this.toppings.add("NY Style Pepperoni Pizza Topping");
    }
}
