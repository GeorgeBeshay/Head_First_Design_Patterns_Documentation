package Ch02_TheObserverPattern;

import java.util.*;

public class WeatherData implements Subject{
	
	private List<Observer> observers;
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData() {
		this.observers = new ArrayList<Observer>();
	}

	public void registerObserver(Observer o) {
		this.observers.add(o);
	}

	public void removeObserver(Observer o) {
		this.observers.remove(o);
	}

	public void notifyObservers() {
		for(Observer observer : this.observers) {
			observer.update();
		}
	}
	
	public void measurementsChanged() {
		this.notifyObservers();
	}
	
	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		this.measurementsChanged();
	}

	public float getTemperature() {
		return temperature;
	}

	public float getHumidity() {
		return humidity;
	}

	public float getPressure() {
		return pressure;
	}
	
	

}
