package c9_innerclass;
import c9_innerclass.controller.*;

class GreenhouseControls25 extends GreenhouseControls {
    private boolean waterMist = false;
    public class WaterMistOn extends Event {
        public WaterMistOn(long delayTime) {
            super(delayTime);
        }
        public void action() {
            // Put hardware control code here to
            // physically turn on water mist generator
            waterMist = true;
        }
        public String toString() {
            return "Water mist generator on";
        }
    }
    public class WaterMistOff extends Event {
        public WaterMistOff(long delayTime) {
            super(delayTime);
        }
        public void action() {
            // Put hardware control code here to
            // physically turn off water mist generator
            waterMist = false;
        }
        public String toString() {
            return "Water mist generator off";
        }
    }
}

public class E25_GreenhouseController {
    public static void main(String[] args) {
        GreenhouseControls25 gc = new GreenhouseControls25();
        // Instead of hard-wiring, you could parse
        // configuration information from a text file here:
        gc.addEvent(gc.new Bell(900));
        Event[] eventList = {
                gc.new ThermostatNight(0),
                gc.new LightOn(200),
                gc.new LightOff(400),
                gc.new WaterOn(600),
                gc.new WaterMistOn(650),
                gc.new WaterMistOff(700),
                gc.new WaterOff(800),
                gc.new ThermostatDay(1400),
        };
        gc.addEvent(gc.new Restart(2000, eventList));
        if(args.length == 1)
            gc.addEvent(
                    new GreenhouseControls.Terminate(
                            new Integer(args[0])));
        gc.run();
    }
}
