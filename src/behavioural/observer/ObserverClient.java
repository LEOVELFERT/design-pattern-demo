package behavioural.observer;


import behavioural.observer.impl.MobileDevice;
import behavioural.observer.impl.WeatherStation;

public class ObserverClient {
    public static void main(String[] args) {

        WeatherStation weatherStation = new WeatherStation();
        Observer mobileDevice = new MobileDevice();
        Observer displayDevice = new MobileDevice();

        weatherStation.attachObserver(mobileDevice);
        weatherStation.attachObserver(displayDevice);

        weatherStation.setTemperature(100);

    }
}
