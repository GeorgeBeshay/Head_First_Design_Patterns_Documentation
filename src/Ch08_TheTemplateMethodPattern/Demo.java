package Ch08_TheTemplateMethodPattern;

import java.util.ArrayList;
import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {

//        Coffee myCoffee = new Coffee();
//        myCoffee.prepareRecipe();
//
//        System.out.println();
//
//        Tea myTea = new Tea();
//        myTea.prepareRecipe();

        Duck[] ducks = {
                new Duck("Duck 1", 8),
                new Duck("Duck 2", 2),
                new Duck("Duck 3", 7),
                new Duck("Duck 4", 2),
                new Duck("Duck 5", 10),
                new Duck("Duck 6", 1),
        };

        System.out.println("Before sorting the ducks ..");
        display(ducks);

        Arrays.sort(ducks);

        System.out.println("\nAfter sorting ..");
        display(ducks);

    }

    public static void display(Duck[] ducks){
        for(Duck duck : ducks)
            System.out.println(duck);
    }
}
