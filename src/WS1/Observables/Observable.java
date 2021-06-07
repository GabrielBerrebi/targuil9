package WS1.Observables;
import WS1.Observers.*;
import java.util.ArrayList;
import java.util.List;
public class Observable {
    public List<Observer> observers;

    public void registerObserver(Observer obs) {
        observers.add(obs);
    }

    public void unregisterObserver(Observer obs) {
        for (Observer observer : observers) {
            if (observer == obs) {
                observers.remove(observer);
            }
        }
    }
    public void notifyObservers(int data) {
       for (Observer obs: observers)
       {
           obs.update(data);}
    }
}