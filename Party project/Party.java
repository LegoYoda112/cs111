/*------------------------------------------------------------------------------------------------------------

* Program Name: Party.java

* Programmer Name: Thomas Godden

* Description: Contains party data

* Date: 5/10/2018

---------------------------------------------------------------------------------------------------------------*/

public class Party{
	//Guests, Date and Time variables
	public int guests;
	public String date;
	public String time;
	
	//No arg constructor
	public Party(){
		guests = 50;
		time = "6:00 PM";
	}
	
	//Full constructor
	public Party(int guests, String date, String time){
		this.guests = guests;
		this.date = date;
		this.time = time;
	}
	
	//Returns the amount of guests
	public int getGuests(){
		return guests;
	}
	
	//Sets the amount of guests
	public void setGuests(int newGuests){
		guests = newGuests;
	}
	
	//Returns the date
	public String getDate(){
		return date;
	}
	
	//Sets the date
	public void setDate(String newDate){
		date = newDate;
	}
	
	//Returns the time
	public String getTime(){
		return time;
	}
	
	//Sets the time
	public void setTime(String newTime){
		time = newTime;
	}
}