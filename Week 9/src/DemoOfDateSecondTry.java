/*------------------------------------------------------------------------------------------------------------

* Program Name: DemoOfDateSecondTry.java

* Programmer Name: Thomas Godden

* Description: To use the DateSecondTry class we wrote

* Date: 3/15/2018

---------------------------------------------------------------------------------------------------------------*/
//Defines the DemoOfDateSecondTry class
public class DemoOfDateSecondTry {
	//Defines the main method
	public static void main(String[] args){
		//Instantiates DateSecondTry
		DateSecondTry date = new DateSecondTry();
		//Calls the readInput method
		date.readInput();
		
		//Sets day number equal to day using the getDay method
		int dayNumber = date.getDay();
		//Prints out the number of the month that the day is
		System.out.println("That is the " + dayNumber + "th day of the month");
	}
}
