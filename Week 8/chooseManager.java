/*------------------------------------------------------------------------------------------------------------

* Program Name: chooseManager.java

* Programmer Name: Thomas Godden

* Description: Displays the private or corporate manager depending on user selectoin

* Date: 3/13/2018

---------------------------------------------------------------------------------------------------------------*/

//imports the scanner
import java.util.Scanner;

public class chooseManager{
	public static void main(String args[]){
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
			//If the eventType is 'c' print the coperate manager
			System.out.println("You selected a coperate event");
			System.out.println("The corporate manager is Dustin Britt");
		} else if (eventType == 'p'){
			//If the eventType is 'p' print the private manager
			System.out.println("You selected a private event");
			System.out.println("The private manager is Carmen Lindsey");
		}else{
			//If the eventType is nither, tell the user that it is invalid
			System.out.println("\"" + eventType + "\" is an invalid selectoin.");
		}
	}
}