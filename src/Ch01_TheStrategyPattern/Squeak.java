package Ch01_TheStrategyPattern;

public class Squeak implements QuackBehavior{

	@Override
	public void quack() {
		System.out.println("Squeak !!");
	}

}
