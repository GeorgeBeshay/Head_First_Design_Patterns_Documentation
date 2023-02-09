package intro_to_design_patterns;

public class MuteQuack implements QuackBehavior{

	@Override
	public void quack() {
		System.out.println("<< Silence >>");
	}
	
	

}
