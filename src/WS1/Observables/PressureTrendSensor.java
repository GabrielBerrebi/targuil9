package WS1.Observables;

public class PressureTrendSensor  {
    private int lastReading1;
    private int lastReading2;
    private int lastReading3;
    private Trend pressureState;
    private  Trend lastState;

    public Trend calc(){
      if ((lastReading1 > lastReading2) && (lastReading2 > lastReading3)) {return Trend.FALLING;}
      else if ((lastReading1 < lastReading2) && (lastReading2 < lastReading3)) {return Trend.RISING;}
      else return Trend.STABLE;
     }
    public void check (){
        if (lastState!=pressureState){}
    }
    public void update (int a){}


}
