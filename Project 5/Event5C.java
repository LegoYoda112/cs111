/*------------------------------------------------------------------------------------------------------------

* Program Name: Event5C.java

* Programmer Name: Thomas Godden

* Description: Creates an array of events and prints out its contents

* Date: 4/24/2018

---------------------------------------------------------------------------------------------------------------*/
public class Event5C{
	public static void main(String args[]){
		//Array of events
		Event[] someEvents = new Event[5];
		char x = 'x';
		
		//Loops through someEvents and populates the array
		for(int i = 0; i<5; i++){
			someEvents[i] = new Event(x, 0.0);
		}
		
		//Loops through someEvents and prints out the event type and min rate for each element
		for(int i = 0; i<5; i++){
			System.out.print(someEvents[i].getEventType()+" ");
			System.out.println(someEvents[i].getEventMinRate());
			
		}
	}
}