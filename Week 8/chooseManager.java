import java.util.Scanner;

public class chooseManager{
	public static void main(String args[]){
		char eventType;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("C: corporate, P: private");
		System.out.println("Enter the type of event");
		eventType = keyboard.next().toLowerCase().charAt(0);
		
		if(eventType == 'c'){
			System.out.println("You selected a coperate event");
			System.out.println("The corporate manager is Dustin Britt");
		} else if (eventType == 'p'){
			System.out.println("You selected a private event");
			System.out.println("The private manager is Carmen Lindsey");
		}else{
			System.out.println("\"" + eventType + "\" is an invalid selectoin.");
		}
	}
}