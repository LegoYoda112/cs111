/*------------------------------------------------------------------------------------------------------------

* Program Name: Event.java

* Programmer Name: Thomas Godden

* Description: Creating an event class to store and manipulate events

* Date: 4/02/2018

---------------------------------------------------------------------------------------------------------------*/
public class Event{
	//Declares the eventType and eventMinRate varialbes
	private String eventType;
	private double eventMinRate;
	
	//Creates a method called Event that can be passed event and rate peramaters and assignes those too eventType and eventMinRate
	public Event(String event, double rate){
		eventType = event;
		eventMinRate = rate;
	}
	
	//Returns eventType
	public String getEventType(){
		return eventType;
	}
	
	//Returns eventMinRate
	public double getEventMinRate(){
		return eventMinRate;
	}
}