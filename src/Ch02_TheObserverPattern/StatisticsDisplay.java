package Ch02_TheObserverPattern;

public class StatisticsDisplay implements Observer, DisplayElement{
	
	private WeatherData weatherData;
	private float maxTemp = 0.0f;
	private float minTemp = 200;
	private float tempSum = 0.0f;
	private int numReadings;
	
	public StatisticsDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		this.weatherData.registerObserver(this);
	}

	public void display() {
		System.out.println("Statistics Display is Displaying the following:");
		System.out.println("- Average Temperature: " + (this.tempSum / this.numReadings));
		System.out.println("- Maximum Temperature: " + this.maxTemp);
		System.out.println("- Minimum Temperature: " + this.minTemp);
	}

	public void update() {
		float temp = this.weatherData.getTemperature();
		this.tempSum += temp;
		this.numReadings++;
		if(temp > maxTemp)
			this.maxTemp = temp;
		if(temp < minTemp)
			this.minTemp = temp;
		this.display();
	}

}
