package Ch02_TheObserverPattern;

public class ForecastDisplay implements Observer, DisplayElement{
	
	private WeatherData weatherData;
	private float currentPressure = 29.92f;
	private float lastPressure;
	
	public ForecastDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		this.weatherData.registerObserver(this);
	}

	public void display() {
		System.out.println("Forecast Display is Displaying the following:");
		if(this.currentPressure > this.lastPressure)
			System.out.println("Improving weather is on the way !");
		else if(this.currentPressure == this.lastPressure)
			System.out.println("More of the same.");
		else if(this.currentPressure < this.lastPressure)
			System.out.println("Watch out for cooler, rainy weather !");
	}

	public void update() {
		this.lastPressure = this.currentPressure;
		this.currentPressure = this.weatherData.getPressure();
		this.display();
	}

}
