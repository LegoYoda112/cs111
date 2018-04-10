/*------------------------------------------------------------------------------------------------------------

* Program Name: chooseManager.java

* Programmer Name: Thomas Godden

* Description: Displays the private or corporate manager depending on user selectoin

* Date: 4/09/2018

---------------------------------------------------------------------------------------------------------------*/

//imports the scanner
import java.util.Scanner;

public class ChooseManagerB{
	public static final double CORP_RATE = 75.99;
	public static final double PRI_RATE = 47.99;
	
	public static void main(String[] args){
		Event anEvent = new Event("", 0);
		
		//Declares the event type char
		char eventType;
		
		//Declares and initializes the keyboard Scanner
		Scanner keyboard = new Scanner(System.in);
		
		//Prompts the user for the type of the event
		System.out.println("C: corporate, P: private");
		System.out.println("Enter the type of event");
		
		//Pulls the next String, converts it to lower case and gets the first character
		eventType = keyboard.next().toLowerCase().charAt(0);
		
		if(eventType == 'c'){
			//If the eventType is 'c' set anEvent to the details for a corperate event
			anEvent = new Event("Corperate", CORP_RATE);
		} else if (eventType == 'p'){
			//If the eventType is 'p' set anEvent to the details for a private event
			anEvent = new Event("Private", PRI_RATE);
		}
		
		//Print the result
		System.out.println("You selected a" + anEvent.getEventType()+ "event");
		System.out.println("The rate is $" + anEvent.getEventMinRate());
	}
	
}