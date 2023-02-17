package Ch01_TheStrategyPattern;

public abstract class Duck {
	
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	public Duck() {}
	
	public abstract void display();
	
	public void setFlyBehavior(FlyBehavior fb) {
		this.flyBehavior = fb;
	}
	
	public void setQuackBehavior(QuackBehavior qb) {
		this.quackBehavior = qb;
	}
	
	public void performFly() {
		this.flyBehavior.fly();;
	}
	
	public void performQuack() {
		this.quackBehavior.quack();
	}
	
	public void swim() {
		System.out.println("All Ducks Float.");
	}

}
