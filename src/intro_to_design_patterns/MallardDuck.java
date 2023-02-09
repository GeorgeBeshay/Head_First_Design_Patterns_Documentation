package intro_to_design_patterns;

public class MallardDuck extends Duck{
	
	public MallardDuck() {
		super();
		this.flyBehavior = new FlyWithWings();
		this.quackBehavior = new Quack();
	}

	@Override
	public void display() {
		System.out.println("I'm a real Mallard Duck.");
	}

}
