package intro_to_design_patterns;

public class FlyNoWay implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("I can't fly !!");
	}

}
