package Assignment_lambdaexpression;

@FunctionalInterface
interface LightBehavior {
 void activate();
}

class SmartLight {
 private String name;
 private LightBehavior behavior;

 public SmartLight(String name) {
     this.name = name;
 }

 public void setBehavior(LightBehavior behavior) {
     this.behavior = behavior;
 }

 public void trigger() {
     System.out.print(name + " Light: ");
     if (behavior != null)
         behavior.activate();
     else
         System.out.println("No behavior set!");
 }
}

public class Smarthomeautomation {
 public static void main(String[] args) {

     SmartLight livingRoomLight = new SmartLight("Living Room");
     SmartLight bedroomLight = new SmartLight("Bedroom");

     LightBehavior motionSensorBehavior = () -> 
         System.out.println("Motion detected! Turning ON bright white light.");

     LightBehavior nightModeBehavior = () -> 
         System.out.println("It's night time! Switching to warm dim light.");

     LightBehavior voiceCommandBehavior = () -> 
         System.out.println("Voice command received! Changing color to blue.");

     livingRoomLight.setBehavior(motionSensorBehavior);
     livingRoomLight.trigger();

     bedroomLight.setBehavior(nightModeBehavior);
     bedroomLight.trigger();

     bedroomLight.setBehavior(voiceCommandBehavior);
     bedroomLight.trigger();
 }
}
