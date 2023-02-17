package Ch01_TheStrategyPattern;

public class MiniDuckSimulator {

	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();
		System.out.println("------------------- Separator -------------------");
		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		System.out.println("Fly Behavior has been changed.");
		model.performFly();
		System.out.println("------------------- Separator -------------------");
	}

}
