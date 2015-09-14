package sprites;
import ch.aplu.robotsim.*;

/**
 * 
 * @author a
 * The Pathfinder has two light sensors facing the ground. With their help the robot can distinguish between a brighter or darker ground.
 * The following example shows how the Pathfinder can follow a bright path on a dark ground.
 * The sensors check the difference between the illuminance of the left and right LED reflection.
 * If the difference is higher than 50 (sensor outside path) the robot adjusts its direction.
 * If both sensors measure more or less the same value inside the bright range the Pathfinder move straight forward.
 * If both sensor measurements are inside the dark range, the robot moves backwards until it finds the path again.
 */
public class PathFinder {
	
	public PathFinder()
	  {
	    NxtRobot robot = new NxtRobot();
	    Gear gear = new Gear();
	    LightSensor ls1 = new LightSensor(SensorPort.S1); // right
	    LightSensor ls2 = new LightSensor(SensorPort.S2); // left
	    robot.addPart(gear);
	    robot.addPart(ls1);
	    robot.addPart(ls2);
	    gear.forward();

	    while (true)
	    {
	    	/*The value of the right sensor is saved as rightValue*/
	      int rightValue = ls1.getValue();
	      int leftValue = ls2.getValue();
	      int d = rightValue - leftValue;
	      if (d > 100) // left dark , turn right
	        gear.rightArc(0.1);
	      if (d < -100) // right dark, turn left
	        gear.leftArc(0.1);
	      if (d > -100 && d < 100 && rightValue > 500)
	        gear.forward();
	    }
	  }
	
	
	
	// ------------------ Environment --------------------------
	  static
	  {
	    NxtContext.setStartPosition(250, 490);
	    NxtContext.setStartDirection(-90);
	    NxtContext.useBackground("sprites/path.gif");
	  }

}
