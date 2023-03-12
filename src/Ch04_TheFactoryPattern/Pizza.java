package Ch04_TheFactoryPattern;

import java.util.*;

public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    List<String> toppings = new ArrayList<>();
    void prepare(){
        System.out.println("Preparing " + this.name);
        System.out.println("Tossing dough ...");
        System.out.println("Adding Sauce ...");
        System.out.println("Adding toppings: ");
        for(String topping : this.toppings){
            System.out.println(" " + topping);
        }
    }
    void bake(){
        System.out.println("Baking for 25 minutes at 350 ..");
    }
    void cut(){
        System.out.println("Cutting the pizza into diagonal slices ..");
    }
    void box(){
        System.out.println("Placing the pizza in the official PizzaStore box ..");
    }

    public String getName() {
        return this.name;
    }
}
