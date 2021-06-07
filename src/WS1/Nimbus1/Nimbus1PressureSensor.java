package WS1.Nimbus1;
import java.util.Random;
import WS1.Observables.Sensor;

public class Nimbus1PressureSensor extends Sensor {
     private int pressure_value;
     private String name="Pressure";
     public Nimbus1PressureSensor(String name,int interval){
         super(name,interval);
         int randNum = (int)(Math.random()*((1050-950)+1))+950;
         pressure_value=randNum;
     }

    @Override
    protected int read() {
        return pressure_value;
    }


    public String getName() {
        return name;
    }

}
