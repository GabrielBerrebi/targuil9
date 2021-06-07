package WS1.Observables;
import WS1.Nimbus1.Nimbus1PressureSensor;
import WS1.Observers.*;
import WS1.Observables.*;
public class WeatherMonitoringSystem {
    private static WeatherMonitoringSystem instance;
    private Nimbus1PressureSensor pressureSensor;
    public void addPressureObserver(Observer  observer) {
       pressureSensor.registerObserver(observer);
    }
    public void addPressureTrendObserver(Observer  observer) {
        pressureSensor.registerObserver(observer);
    }
}
