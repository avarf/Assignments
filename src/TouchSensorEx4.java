package sprites;
import ch.aplu.robotsim.*;


import ch.aplu.robotsim.SensorPort;
import ch.aplu.robotsim.TouchListener;

public class TouchSensorEx4 implements TouchListener {

	private Gear gear = new Gear();

	  TouchSensorEx4()
	  {
	    NxtRobot robot  = new NxtRobot();
	    TouchSensor ts1 = new TouchSensor(SensorPort.S1);
	    TouchSensor ts2 = new TouchSensor(SensorPort.S2);
	    robot.addPart(ts1);
	    robot.addPart(ts2);
	    ts1.addTouchListener(this);
	    ts2.addTouchListener(this);
	    gear.setSpeed(35);
	    robot.addPart(gear);
	    gear.forward();
	  }

	    public void pressed(SensorPort port)
	    {
	      if (port == SensorPort.S1)
	      {
	        gear.backward(700);
	        gear.left(200);
	      }
	      else
	        if (port == SensorPort.S2)
	        {
	           gear.backward(700);
	           gear.right(200);
	        }
	      gear.forward();
	    }
	    
	    public void released(SensorPort port)
	    {}
	    
	    
	 // ------------------ Environment --------------------------
	    static
	    {
	      NxtContext.useObstacle("sprites/square.gif", 250, 250);  //draws a green frame around the window's edge
	      NxtContext.setStartDirection(-30);  //sets the starting direction of the robot
	    }

}
