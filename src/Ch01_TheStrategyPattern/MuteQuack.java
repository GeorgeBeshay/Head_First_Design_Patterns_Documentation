package Ch01_TheStrategyPattern;

public class MuteQuack implements QuackBehavior{

	@Override
	public void quack() {
		System.out.println("<< Silence >>");
	}
	
	

}
