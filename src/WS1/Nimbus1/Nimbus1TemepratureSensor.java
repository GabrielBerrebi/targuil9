package WS1.Nimbus1;

import WS1.Observables.Sensor;

public class Nimbus1TemepratureSensor extends Sensor {
    private int temperature_value;
    private String name="Pressure";
    public Nimbus1TemepratureSensor(String name,int interval){
        super(name,interval);
        int randNum = (int)(Math.random()*((40-0)+1))+0;
        temperature_value=randNum;
    }

    @Override
    protected int read() {
        return temperature_value;
    }
    public String getName() {
        return name;
    }

}
