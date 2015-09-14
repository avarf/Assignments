package sprites;
import ch.aplu.robotsim.*;
import ch.aplu.robotsim.SensorPort;
import ch.aplu.robotsim.SoundListener;

/**
 * 
 * @author a
 *  The robot moves forward. If it senses a clapping of hands it turns left and then moves straight forward again.
 *
 */
public class SoundSensorEx1 implements SoundListener {

	/* The trigger level is set to 30. If the surrounding is louder the trigger level needs increased*/
	private final int triggerLevel = 30;
	  private Gear gear;

	  public SoundSensorEx1()
	  {
	    NxtRobot robot = new NxtRobot();
	    gear = new Gear();
	    robot.addPart(gear);
	    SoundSensor ss = new SoundSensor(SensorPort.S1);
	    robot.addPart(ss);
	    
	    /* 
	     * Similar as with the light and touch sensor a SoundListener is implemented.
		 * The interface SoundListener includes two callback-methods loud() and quiet()
		 */
	    ss.addSoundListener(this, triggerLevel);
	    gear.setSpeed(30);
	    gear.forward();
	    while (true){}
	  }

	  public void loud(SensorPort port, int level)
	  {
	    gear.right(480);
	    gear.forward();
	  }

	  public void quiet(SensorPort port, int level)
	  {
	  }
	  

}
