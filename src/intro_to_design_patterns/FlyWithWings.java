package intro_to_design_patterns;

public class FlyWithWings implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("I'm flying with my wings.");
	}

}
