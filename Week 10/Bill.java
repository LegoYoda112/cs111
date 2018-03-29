/*------------------------------------------------------------------------------------------------------------

* Program Name: Bill.java

* Programmer Name: Thomas Godden

* Description: A class that contains methods to figure out the bill of the user and display it

* Date: 3/29/2018

---------------------------------------------------------------------------------------------------------------*/


//Imports the scanner class
import java.util.Scanner;

//Defines the Bill class
public class Bill{
	//Sets a rate constant equal to 150
	public static final double RATE = 150.00;
	
	//Declares private hours, minutes and fee variables
	private int hours;
	private int minutes;
	private double fee;
	
	//Defines the inputTimeWorked method
	public void inputTimeWorked(){
		//Prompts the user for the hours and minutes worked
		System.out.println("Enter the number of full hours worked");
		System.out.println("followed by the number of minutes:");
		Scanner keyboard = new Scanner(System.in);
		hours = keyboard.nextInt();
		minutes = keyboard.nextInt();
	}
	
	private double computeFee(int hoursWorked, int minutesWorked){
		//Computes the minutes worked
		minutesWorked = hoursWorked*60+minutesWorked;
		//Computes the quarter hours worked
		int quarterHours = minutesWorked/15;
		//Returns the fee
		return quarterHours*RATE;
	}
	
	public void updateFee(){
		//Calculates the fee based off of hours and minutes
		fee = computeFee(hours, minutes);
	}
	
	public void outputBill(){
		//Rrints out the hours/minutes worked, the rate and the total fee
		System.out.println("Time worked: ");
		System.out.println(hours + " hours and " + minutes + " minutes");
		System.out.println("Rate: $"+RATE + " per quarter hour.");
		System.out.println("Amount due: $" + fee);
	}
}