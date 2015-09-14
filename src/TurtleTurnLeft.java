package sprites;
import ch.aplu.robotsim.*;

/**
 * 
 * @author a
 * To turn the robot left, the method left(90) can be used.
 */
public class TurtleTurnLeft {
	
	TurtleTurnLeft()
	  {
	    TurtleRobot robot = new TurtleRobot();
	    robot.forward(200);
	    robot.left(90);
	    robot.forward(200);
	    robot.exit();
	  }


}
