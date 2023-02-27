package Ch03_TheDecoratorPattern;

public abstract class Beverage {
    public enum Size {Tall, GRANDE, VENTI};
    Size size = Size.Tall;
    String description = "Unknown Beverage";
    public String getDescription(){
        return this.description;
    }
    public abstract double cost();
    public Size getSize() {
        return size;
    }
    public void setSize(Size size) {
        this.size = size;
    }
}
