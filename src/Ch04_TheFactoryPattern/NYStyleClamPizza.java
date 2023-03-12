package Ch04_TheFactoryPattern;

public class NYStyleClamPizza extends Pizza{
    public NYStyleClamPizza(){
        this.name = "NY Style Clam Pizza";
        this.dough = "NY Style Clam Pizza Dough";
        this.sauce = "NY Style Clam Pizza Sauce";
        this.toppings.add("NY Style Clam Pizza Topping");
    }
}
