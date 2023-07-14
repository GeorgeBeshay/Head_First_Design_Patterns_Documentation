package Ch08_TheTemplateMethodPattern;

public class Demo {
    public static void main(String[] args) {

        Coffee myCoffee = new Coffee();
        myCoffee.prepareRecipe();

        System.out.println();

        Tea myTea = new Tea();
        myTea.prepareRecipe();

    }
}
