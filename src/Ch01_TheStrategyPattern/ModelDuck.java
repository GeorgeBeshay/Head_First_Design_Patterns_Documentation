package Ch01_TheStrategyPattern;

public class ModelDuck extends Duck{
	
	public ModelDuck() {
		super();
		this.flyBehavior = new FlyNoWay();
		this.quackBehavior = new Quack();
	}

	@Override
	public void display() {
		System.out.println("I'm a model duck.");
	}

}
