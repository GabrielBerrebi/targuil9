package WS1.Observers;

public class MSPressObserver implements  Observer {
    public MonitoringScreen itsMonitoring= new MonitoringScreen();
    public MSPressObserver(MonitoringScreen ms)
    {
        this.itsMonitoring=ms;
    }

    @Override
    public void update(int data) {
        itsMonitoring.displayTemp(data);
    }
}
