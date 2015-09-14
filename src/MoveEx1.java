package sprites;
import ch.aplu.robotsim.*;

/**
 * 
 * Moving forward, changing directions or stopping can easily be realized with a TurtleRobot.
 * TurtleRobot is a NxtRobot with a gear and it can be controlled using the simple Turtle-Graphics methodes.
 * 
 *
 */
public class MoveEx1 {
	
	
	MoveEx1()
	  {
		/* generates a new TurtleRobot object robot and builds up the Bluetooth connection
		 *  between the robot and the computer */
	    TurtleRobot robot = new TurtleRobot();
	    
	    /*this method locks the program and causes it to move the robot
	     * forward for 100 milliseconds before continuing with the other commands*/
	    robot.forward(100);
	    
	    /* turns the robot 90 degrees to the left*/
	    robot.left(90);
	    robot.forward(50);
	    
	    /*turns the robot 90 degrees to the right*/
	    robot.right(90);
	    robot.forward(50);
	    
	    /* stops both motors and terminates the Bluetooth connection between the robot and the computer*/
	    robot.exit();
	  }

}
