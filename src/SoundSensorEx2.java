package sprites;
import ch.aplu.robotsim.*;

/**
 * 
 * @author a
 * The robot starts moving after hearing an acoustic signal (e.g. clapping your hand or whistling). It moves forward until the Quit-Button is pressed. 
 * This starting procedure is often used in competitions.
 * The sound sensor returns the volume of the sound with the method getValue() (the higher the returned value, the louder the sound). 
 */
public class SoundSensorEx2 {
	
	public SoundSensorEx2()
	  {
	    int triggerLevel = 30;
	    NxtRobot robot = new NxtRobot();
	    Gear gear = new Gear();
	    robot.addPart(gear);
	    SoundSensor ss = new SoundSensor(SensorPort.S1);
	    robot.addPart(ss);

	    while (true)
	    {
	      if (ss.getValue() > triggerLevel)
	        gear.forward();
	    } 
	  }

}
