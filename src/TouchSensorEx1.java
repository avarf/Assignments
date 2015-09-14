package sprites;
import ch.aplu.robotsim.*;

/**
 * 
 * @author a
 * The touch sensor reacts to contact. In the following example the NXT moves forward until the touch sensor is pressed (robot registers an obstacle).
 * After this the robot moves backward for a short distance, turns ca. 90° left and moves forward again.
 */
public class TouchSensorEx1 {

	public TouchSensorEx1()
	  {
	    NxtRobot robot = new NxtRobot();
	    Gear gear = new Gear();
	    robot.addPart(gear);
	    TouchSensor ts = new TouchSensor(SensorPort.S3);  //creates TouchSensor
	    robot.addPart(ts);  //fixes the TouchSensor to the Robot
	    gear.setSpeed(30);
	    gear.forward();

	    while (true)
	    {
	      if (ts.isPressed())  //if the TouchSensor is pressed do
	      {
	        gear.backward(1000);
	        gear.left(485);
	        gear.forward();
	      }
	    }
	  }
	
	
	   // ------------------ Environment --------------------------
	static
	  {
	    NxtContext.useObstacle("sprites/square.gif", 250, 250);  
	  }
	
}
