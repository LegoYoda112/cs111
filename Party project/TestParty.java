/*------------------------------------------------------------------------------------------------------------

* Program Name: TestParty.java

* Programmer Name: Thomas Godden

* Description: Driver class for our party class

* Date: 5/10/2018

---------------------------------------------------------------------------------------------------------------*/


public class TestParty{
	public static void main(String args[]){
		
		//Creates a new party using the default constructor
		Party myBDay =  new Party();
		
		//Sets the date and time
		myBDay.setDate("September 9th 2018");
		myBDay.setTime("4:00 PM");
		
		//Creats a new party using the overloaded constructor
		Party yourBDay = new Party(63, "Janurary 2nd 2019", "11:00AM");
		
		//Sets the date
		yourBDay.setDate("January 3rd 2019");
		
		//Print contents of myBDay and yourBDay
		System.out.println("myBDay: # of guests, " + myBDay.getGuests() + " Date: " + myBDay.getDate() + ", Time: " + myBDay.getTime() + ".");
		System.out.println("yourBDay: # of guests, " + yourBDay.getGuests() + " Date: " + yourBDay.getDate() + ", Time: " + yourBDay.getTime() + ".");
	}
}