package sprites;
import ch.aplu.robotsim.*;

/**
 * 
 * @author a
 * If the speed of the right motor is faster than the speed of the left motor, the robot moves in a circle. 
 * The length of the arc of circle is defined with the time frame in the command Tools.delay().
 */
public class CircleEx2 {
	
	CircleEx2()
	  {
	    NxtRobot robot = new NxtRobot();
	    Motor motA = new Motor(MotorPort.A);
	    Motor motB = new Motor(MotorPort.B);
	    robot.addPart(motA);
	    robot.addPart(motB);
	    
	    /* The bigger the difference of speeds, the smaller the radius*/
	    motA.setSpeed(60);
	    motB.setSpeed(30);
	    motA.forward();
	    motB.forward();
	    Tools.delay(7000);
	    robot.exit();
	  }

}
