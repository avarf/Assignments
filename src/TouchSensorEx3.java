package sprites;
import ch.aplu.robotsim.*;

/**
 * 
 * @author a
 * he TwinTouch robot has to touch sensors reacting to contact. 
 * The robot tries to avoid or go around obstacles with the following maneuver: 
 * If the left sensor gets pressed the robot move backward for a short distance, turns right and moves forward again. 
 * Similar is the reaction if the right sensor is pressed.
 */
public class TouchSensorEx3 {
	
	public TouchSensorEx3()
	  {
	    NxtRobot robot  = new NxtRobot();
	    Gear gear = new Gear();
	    robot.addPart(gear);
	    TouchSensor ts1 = new TouchSensor(SensorPort.S1); // right
	    TouchSensor ts2 = new TouchSensor(SensorPort.S2); // left
	    robot.addPart(ts1);
	    robot.addPart(ts2);
	    gear.setSpeed(30);
	    gear.forward();

	    while (true)
	    {
	      if (ts1.isPressed())
	      {
	        gear.backward(1000);
	        gear.left(200);
	      }
	      else if (ts2.isPressed())
	      {
	        gear.backward(1000);
	        gear.right(300);
	      }
	    gear.forward();
	    }
	  }

	
	
	
	// ------------------ Environment --------------------------
	  static
	  {
	    NxtContext.useObstacle("sprites/obstacle.gif", 250, 250);  //draws a green frame around the window's edge
	    NxtContext.setStartPosition(380,380);
	    NxtContext.setStartDirection(-120);  //sets the starting direction of the robot
	  }

}
