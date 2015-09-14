package sprites;
import ch.aplu.robotsim.*;

/**
 * 
 * @author a
 * The robot "mows" a square area limited by two opposed walls. 
 * It moves in straight lines and every time it hits a wall, it turns in a right angle, 
 * moves forward a short distance parallel to the wall and then rotates again 90 degrees to finally move back to the other side.
 */
public class SimMower {
	
	public SimMower()
	  {
	    NxtRobot robot = new NxtRobot();
	    Gear gear = new Gear();
	    TouchSensor ts = new TouchSensor(SensorPort.S3);
	    robot.addPart(ts);
	    gear.setSpeed(30);
	    robot.addPart(gear);
	    gear.forward();
	    int i = 1;

	    while (true)
	    {
	      if (ts.isPressed())
	      {
	        gear.backward(800);

	        /* 
	         * The robot needs to turn left at the top and right at the bottom. 
	         * This can be achieved by counting the rows the robot is moving in. 
	         * In each uneven row it needs to turn left and in each even row it has to turn right
	         */
	        if (i % 2 == 1)    // odd lines, turn left
	        {
	          gear.left(480);
	          gear.forward(800);
	          gear.left(480);
	        }
	        else                // even lines, turn right
	        {
	          gear.right(480);
	          gear.forward(800);
	          gear.right(480);
	        }
	        gear.forward();
	        i++;   
	      }
	    }
	  }
	
	
	 // ------------------ Environment --------------------------
	static
	  {
	    NxtContext.useObstacle("sprites/box.gif", 250, 250);
	    NxtContext.setStartPosition(480, 475);
	    NxtContext.setStartDirection(-90);
	  }

}
