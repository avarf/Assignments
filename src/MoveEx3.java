package sprites;
import ch.aplu.robotsim.*;


public class MoveEx3 {
	
	public MoveEx3()
	  {
		/*generates a new NxtRobot object robot and builds up the Bluetooth connection between the robot and the computer*/
	    NxtRobot robot = new NxtRobot();
	    
	    /*generates a new Motor object motA (A corresponds with the plug A on the Lego NXT robot)*/
	    Motor motA = new Motor(MotorPort.A);
	    Motor motB = new Motor(MotorPort.B);
	    robot.addPart(motA);
	    robot.addPart(motB);

	    motA.forward();
	    motB.forward();
	    
	    /* causes the program to wait for 2000 milliseconds (2 seconds)*/
	    Tools.delay(2000);

	    motA.stop();
	    Tools.delay(1050);

	    motA.forward();
	    Tools.delay(2000);

	    motB.stop();
	    Tools.delay(1050);

	    motB.forward();
	    Tools.delay(2000);
	    
	    /* stops both motors and terminates the Bluetooth connection between the robot and the computer*/
	    robot.exit();
	  }

}
