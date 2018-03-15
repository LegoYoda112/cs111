/*------------------------------------------------------------------------------------------------------------

* Program Name: DemoOfDateSecondTry.java

* Programmer Name: Thomas Godden

* Description: To use the DateSecondTry class we wrote

* Date: 3/15/2018

---------------------------------------------------------------------------------------------------------------*/
public class DemoOfDateSecondTry {
	public static void main(String[] args){
		DateSecondTry date = new DateSecondTry();
		date.readInput();
		
		int dayNumber = date.getDay();
		System.out.println("That is the " + dayNumber + "th day of the month");
	}
}
