package WS1.Observers;

public class MSTempObserver implements Observer{
    public MonitoringScreen itsMonitoring= new MonitoringScreen();
    public MSTempObserver(MonitoringScreen ms)
    {
        this.itsMonitoring=ms;
    }

    @Override
    public void update(int data) {
     itsMonitoring.displayTemp(data);
    }
}
