package sprites;
import ch.aplu.robotsim.*;

/**
 * 
 * @author a
 *
 */
public class MoveEx2 {
	
	MoveEx2()
	  {
		/*generates a new NxtRobot object robot and builds up the Bluetooth connection between the robot and the computer*/
	    NxtRobot robot = new NxtRobot();
	    
	    /*generates a gear with two motors connected to the plugs A and B*/
	    Gear gear = new Gear();
	    
	    /* adds the gear to the robot*/
	    robot.addPart(gear);
	    
	    /*this method locks the program and causes it to let the motors
	     * of the gear rotate forward for 2000 milliseconds before continuing with the other commands*/
	    gear.forward(2000);
	    gear.setSpeed(30);
	    
	    /*turns left for 480 ms, more or less 90 degrees*/
	    gear.left(480);
	    gear.forward(2000);
	    gear.right(480);
	    
	    /*the method forward() using no parameter is doesn't lock the program.
	     * The robot is simply set to moving forward until a new command is executed.
	     * This way it is possible to react to new inputs instantly.*/
	    gear.forward();
	    
	    /*if this line is activated (delete the two slashes), the robot moves forward for 2000 ms before terminating.
	     * This way the program is locked again. Otherwise it would exit directly after executing the forward command*/
	    // Tools.delay(2000);
	    robot.exit();
	  }

}
