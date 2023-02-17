package Ch01_TheStrategyPattern;

public class FlyWithWings implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("I'm flying with my wings.");
	}

}
