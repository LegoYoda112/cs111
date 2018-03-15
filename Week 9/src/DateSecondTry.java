/*------------------------------------------------------------------------------------------------------------

* Program Name: DateSecondTry.java

* Programmer Name: Thomas Godden

* Description: A class that contains date reading, writing and interpreting method

* Date: 3/15/2018

---------------------------------------------------------------------------------------------------------------*/
//imports the Scanner class
import java.util.Scanner;

//defines the DateSecondTry method
public class DateSecondTry {
	//Declares variables
	private String month;
	private int day;
	private int year;
	
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
