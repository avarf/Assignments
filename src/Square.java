package sprites;
import ch.aplu.robotsim.*;


public class Square {
	
	Square()
	  {
	    TurtleRobot robot = new TurtleRobot();
	    for (int i = 0; i < 4; i++)          
	    {
	      robot.forward(100);
	      robot.left(90);
	    }
	    robot.exit();
	  }

}
