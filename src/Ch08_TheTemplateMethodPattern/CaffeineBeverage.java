package Ch08_TheTemplateMethodPattern;

public abstract class CaffeineBeverage {
    final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        addCondiments();
        if(hookMethod())
            System.out.println("hookMethod() is true !!");
    }

    abstract void brew();
    abstract void addCondiments();

    final void boilWater() {
        System.out.println("Boiling water ..");
    }

    final void pourInCup(){
        System.out.println("Pouring into cup ..");
    }

    boolean hookMethod(){
        return false;
    }

}
