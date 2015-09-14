package sprites;
import ch.aplu.robotsim.*;

/**
 * 
 * @author a
 * To turn the robot left, the method left() can be used.
 * If there are several movement commands follow one another, the robot does not stop between each one.
 */
public class TurnLeft {
	
	TurnLeft()
	  {
	    NxtRobot robot = new NxtRobot();
	    Gear gear = new Gear();
	    robot.addPart(gear);
	    gear.setSpeed(30);
	    gear.forward(2000);
	    gear.left(480);
	    gear.forward(2000);
	    robot.exit();
	  }

}
