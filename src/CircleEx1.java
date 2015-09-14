package sprites;
import ch.aplu.robotsim.*;

/**
 * 
 * @author a
 * 
 */
public class CircleEx1 {
	
	CircleEx1()
	  {
	    NxtRobot robot = new NxtRobot();
	    Gear gear = new Gear();
	    robot.addPart(gear);
	    gear.setSpeed(60);
	    
	    /*The robot move in a circle with the radius 0.2 for 7500 ms.
		 *Instead of using a locking-method, the method leftArc(0.2) can be used together with the command Tools.delay(7500)
		 */
	    gear.leftArc(0.2, 7500); 
	    
	    /* No blocking Methode rightArc()*/
	    gear.rightArc(0.2);
	    Tools.delay(5000);
	    robot.exit();
	  }

}
