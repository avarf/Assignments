package sprites;
import java.util.Scanner;

/**
 * 
 * @author Ali Varfan
 *
 */
public class Main {

	public static void main(String[] args) {
		
		test();
		
	}

	
	
	/*
	 * This function asks the user about his desired plan and implement it
	 */
	public static void test(){
		
		String[] options = {"BorderFollowEx1","BorderFollowEx2","CircleEx1","CircleEx2","LightSensorEx1","LightSensorEx2",
				"MoveEx1","MoveEx2","MoveEx3","PathFinder","SimMower","SoundSensorEx1","SoundSensorEx2","Square",
				"TouchSensorEx1","TouchSensorEx3","TouchSensorEx4","TurnLeft","TurtleTurnLeft"};
		String userChoice = null;
		
		// continuously asks the user until he enter "finish"
		do{
			
			// print the options
			System.out.println("please choose the plan:");
			for(int i=0;i<options.length;i++){
				System.out.println(options[i]);
			}
			System.out.println("finish");
			
			// reading the user choice
			Scanner scanIn = new Scanner(System.in);	
			userChoice = scanIn.nextLine();

			
			if(userChoice.equals("finish")){
				scanIn.close();
				break;
				
			}else if(userChoice.equals("MoveEx1")){
				new MoveEx1();
				
			}else if(userChoice.equals("MoveEx2")){
				new MoveEx2();
				
			}else if(userChoice.equals("MoveEx3")){
				new MoveEx3();
				
			}else if(userChoice.equals("LightSensorEx1")){
				new LightSensorEx1();
				
			}else if(userChoice.equals("LightSensorEx2")){
				new LightSensorEx2();
				
			}else if(userChoice.equals("TurtleTurnLeft")){
				new TurtleTurnLeft();
				
			}else if(userChoice.equals("BorderFollowEx1")){
				new BorderFollowEx1();
				
			}else if(userChoice.equals("BorderFollowEx2")){
				new BorderFollowEx2();
				
			}else if(userChoice.equals("CircleEx1")){
				new CircleEx1();
				
			}else if(userChoice.equals("CircleEx2")){
				new CircleEx1();
				
			}else if(userChoice.equals("PathFinder")){
				new PathFinder();
				
			}else if(userChoice.equals("SimMower")){
				new SimMower();
				
			}else if(userChoice.equals("SoundSensorEx1")){
				new SoundSensorEx1();
				
			}else if(userChoice.equals("SoundSensorEx2")){
				new SoundSensorEx2();
				
			}else if(userChoice.equals("Square")){
				new Square();
				
			}else if(userChoice.equals("TouchSensorEx1")){
				new TouchSensorEx1();
				
			}else if(userChoice.equals("TouchSensorEx3")){
				new TouchSensorEx3();
				
			}else if(userChoice.equals("TouchSensorEx4")){
				new TouchSensorEx4();
				
			}else if(userChoice.equals("TurnLeft")){
				new TurnLeft();
				
			}
			
			
		}while(true);
		
	}
}
