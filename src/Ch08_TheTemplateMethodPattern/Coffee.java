package Ch08_TheTemplateMethodPattern;

public class Coffee extends CaffeineBeverage{

    @Override
    void brew() {
        System.out.println("Dripping Coffee through filter ..");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding sugar and milk ..");
    }
}
