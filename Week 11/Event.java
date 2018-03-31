public class Event{
	private char eventType;
	private double eventMinRate
	
	public Event(char event, double rate){
		eventType = event;
		eventMinRate = rate;
	}
	
	public char getEventType(){
		return eventType;
	}
	
	public double getEventMinRate(){
		return eventMinRate;
	}
}