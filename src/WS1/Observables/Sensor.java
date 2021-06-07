package WS1.Observables;
import  WS1.Observers.*;
public  abstract class Sensor extends  Observable {
   private int lastReading ;
   private  int interval;
   private String type;

   public   Sensor(String a, int b){
      type=a;
      interval=b;
   }
   protected abstract int read();
   public   void check(){
     int temp=read();
     if (temp!=lastReading){
        lastReading=temp;
        notifyObservers(temp);
     }
   }
}
