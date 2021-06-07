package WS1.Observables;

public class AlarmClockRecord {

    private int interval;
    private int left_over;
    private AlarmListener alarmListener;

    public AlarmClockRecord(int interval, AlarmListener alarmListener) {
        this.interval = interval;
        this.alarmListener = alarmListener;
        this.left_over = 0;
    }

    public int getRemainTime() {
        return left_over;
    }

    public AlarmListener getListener() {
        return alarmListener;
    }

    public int getInterval() {
        return interval;
    }

}