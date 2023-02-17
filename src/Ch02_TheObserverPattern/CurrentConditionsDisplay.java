package Ch02_TheObserverPattern;

public class CurrentConditionsDisplay implements Observer, DisplayElement{
	
	private WeatherData weatherData;
	private float temperature;
	private float humidity;
	
	public CurrentConditionsDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		this.weatherData.registerObserver(this);
	}

	public void display() {
		System.out.println("Current Conditions Display is Displaying the following:");
		System.out.println("- Temperature: " + this.temperature + " F degrees.");
		System.out.println("- Humidity: " + this.humidity + "%.");
	}

	public void update() {
		this.temperature = this.weatherData.getTemperature();
		this.humidity = this.weatherData.getHumidity();
		this.display();
	}

}
