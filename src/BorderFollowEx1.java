package sprites;
import ch.aplu.robotsim.*;

/**
 * 
 * @author a
 *
 */
public class BorderFollowEx1 {
	
	public BorderFollowEx1()
	  {
	    NxtRobot robot = new NxtRobot();

	    LightSensor ls = new LightSensor(SensorPort.S3);
	    robot.addPart(ls);
	    ls.activate(true);
	    Gear gear = new Gear();
	    gear.setSpeed(40);
	    robot.addPart(gear);
	    while (true)
	    {
	      if (ls.getValue() < 500)
	        gear.leftArc(0.1);
	      else
	        gear.rightArc(0.1);
	    }
	  }
	
	   // ------------------ Environment --------------------------
	  static
	  {
	    NxtContext.setStartPosition(250, 490);
	    NxtContext.setStartDirection(-90);
	    NxtContext.useBackground("sprites/black_white.gif");
	  }

}
