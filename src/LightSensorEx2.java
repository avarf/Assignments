package sprites;
import ch.aplu.robotsim.*;

/**
 * 
 * @author a
 * LightListener is an Interface.
 * Interfaces in Java include declaration of methods without commands. 
 * While Java only allows one inheritance per class it is possible to implement several interfaces. 
 * The class itself must declare all methods of the interface. Since the interface LightListener consists of two callback-methods (bright() and dark()), 
 * it is necessary to also declare an empty method dark()
 */
public class LightSensorEx2 implements LightListener, ch.aplu.robotsim.LightListener {
	
	/* Triggerlevel is declared final , meaning that its value can not be changed while the program is running*/
	private final int triggerLevel = 500;
	  private Gear gear;

	  public LightSensorEx2()
	  {
	    NxtRobot robot = new NxtRobot();
	    gear = new Gear();
	    robot.addPart(gear);
	    LightSensor ls = new LightSensor(SensorPort.S3);
	    robot.addPart(ls);
	    
	    /* 
	     * LightListener is registered with the current instance and the Triggerlevel. 
	     * This allows the LightSensor to execute the callback-method
	     */
	    ls.addLightListener(this, triggerLevel);
	    ls.activate(true);
	    gear.setSpeed(30);
	    gear.forward();
	 }

	  public void bright(SensorPort port, int level)
	  {
	    gear.backward(800);
	    gear.left(480);
	    gear.forward();
	  }

	  public void dark(SensorPort port, int level)
	  {
	  }
	  
	// ------------------ Environment --------------------------
	  static
	  {
	    NxtContext.setStartPosition(250, 200);
	    NxtContext.setStartDirection(-90);
	    NxtContext.useBackground("sprites/blackSquare.gif");
	  }

}
