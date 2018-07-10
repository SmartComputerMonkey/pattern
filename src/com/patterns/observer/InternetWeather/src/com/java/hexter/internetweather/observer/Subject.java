package com.patterns.observer.InternetWeather.src.com.java.hexter.internetweather.observer;

public interface Subject {
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObservers();
}
