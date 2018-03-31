/*------------------------------------------------------------------------------------------------------------

* Program Name: DateThirdTry.java

* Programmer Name: Thomas Godden

* Description: A class that contains date reading, writing and interpreting methods

* Date: 3/27/2018

---------------------------------------------------------------------------------------------------------------*/

//imports scanner
import java.util.Scanner;

public class DateThirdTry {
	//Declares variables
	private String month;
	private int day;
	private int year;
	
	//Defines the setDate method, which has parameters: newMonth, newDay and newYear
	public void setDate (int newMonth, int newDay, int newYear){
		//Sets month equal to the String equivalent of newMonth using the monthString method
		month = monthString(newMonth);
		//Sets day and year equal to the newDay and newYear parameters
		day = newDay;
		year = newYear;
	}
	
	//Defines the monthString method, with parameter monthNumber
	public String monthString(int monthNumber){
		//Depending on the month number, return the corresponding month name
		switch (monthNumber){
		case 1:
			return "January";
		case 2:
			return "Febuary";
		case 3:
			return "March";
		case 4:
			return "April";
		case 5:
			return "May";
		case 6:
			return "June";
		case 7:
			return "July";
		case 8:
			return "August";
		case 9:
			return "September";
		case 10:
			return "October";
		case 11:
			return "November";
		case 12:
			return "December";
		default:
			//If the month number does not equal on the of the expected numbers, print and error then exit.
			System.out.println("Fatal error");
			System.exit(0);
			return "Error";
		}
	}
	
	//Defines the writeOutput method
	public void writeOutput(){
		//Prints the month day and year
		System.out.println(month + " " + day + ", " + year);
	}
	
	//Defines the readInput method
	public void readInput()
	{
		//Declares and initializes the keyboard Scanner
		Scanner keyboard = new Scanner(System.in);
		//Prompts the user for the month day and year
		System.out.println("Enter month, day and year.");
		System.out.println("Do not use a comma.");
		//Scans for the next inputed String, int and int
		month = keyboard.next();
		day = keyboard.nextInt();
		year = keyboard.nextInt();
	}
	
	//Defines the getDay method
	public int getDay(){
		//returns day
		return day;
	}
	
	//Defines the getYear method
	public int getYear(){
		//returns year
		return year;
	}
	
	//Defines the getMonth method
	public int getMonth(){
		//Depending on the month name, return the month number
		if(month.equalsIgnoreCase("January")){
			return 1;
		}else if(month.equalsIgnoreCase("Febuary")){
			return 2;
		}else if(month.equalsIgnoreCase("March")){
			return 1;
		}else if(month.equalsIgnoreCase("April")){
			return 1;
		}else if(month.equalsIgnoreCase("June")){
			return 1;
		}else if(month.equalsIgnoreCase("July")){
			return 1;
		}else if(month.equalsIgnoreCase("August")){
			return 1;
		}else if(month.equalsIgnoreCase("September")){
			return 1;
		}else if(month.equalsIgnoreCase("October")){
			return 1;
		}else if(month.equalsIgnoreCase("November")){
			return 1;
		}else if(month.equalsIgnoreCase("December")){
			return 12;
		}else{ 
			//If month is not equal to any of our defined months then print fatal error and exit
			System.out.println("Fatal error");
			System.exit(0);
			return 0;
		}
	}
}
