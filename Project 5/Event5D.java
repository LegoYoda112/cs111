/*------------------------------------------------------------------------------------------------------------

* Program Name: Event5Djava

* Programmer Name: Thomas Godden

* Description: Creates an array of events and prints out its contents

* Date: 5/1/2018

---------------------------------------------------------------------------------------------------------------*/
import java.util.Scanner;

public class Event5D{
	
	public static final double CORP_RATE = 75.99;
	public static final double PRI_RATE = 47.99;
	public static final double NON_PROF_RATE = 40.99;
	
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		char event = ' ';
		double rate = 0;
		
		//Array of events
		Event[] someEvents = new Event[5];
		
		//Loops through someEvents and populates the array
		for(int i = 0; i<5; i++){
			System.out.println("Enter C for coporate, P for private and N for non-profit");
			event = scan.next().charAt(0);
			if(event == 'C'){
				rate = CORP_RATE;
			}else if(event == 'P'){
				rate = PRI_RATE;
			}else if(event == 'N'){
				rate = NON_PROF_RATE;
			}else{
				System.out.println("Invalid entry");
				System.exit(0);
			}
			
			someEvents[i] = new Event(event, rate);
		}
		
		//Loops through someEvents and prints out the event type and min rate for each element
		for(int i = 0; i<5; i++){
			System.out.print(someEvents[i].getEventType()+" ");
			System.out.println(someEvents[i].getEventMinRate());	
		}
	}
}