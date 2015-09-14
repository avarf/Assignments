package sprites;
import ch.aplu.robotsim.*;
import ch.aplu.robotsim.LightListener;

/**
 * 
 * @author a
 *
 */
public class BorderFollowEx2 implements LightListener {
	
	private Gear gear = new Gear();

	  public BorderFollowEx2()
	  {
	    NxtRobot robot = new NxtRobot();

	    LightSensor ls = new LightSensor(SensorPort.S3);
	    robot.addPart(ls);
	    ls.addLightListener(this, 500);
	    ls.activate(true);
	    gear.setSpeed(30);
	    robot.addPart(gear);
	    gear.forward();
	  }

	  public void bright(SensorPort port, int level)
	  {
	    gear.rightArc(0.1);
	  }

	  public void dark(SensorPort port, int level)
	  {
	    gear.leftArc(0.1);
	  }
	  
	  
	    // ------------------ Environment --------------------------
	  static
	  {
	    NxtContext.setStartPosition(230, 490);
	    NxtContext.setStartDirection(-90);
	    NxtContext.useBackground("sprites/black_white.gif");
	  }
	  
	  

}
