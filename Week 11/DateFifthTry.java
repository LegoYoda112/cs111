/*------------------------------------------------------------------------------------------------------------

* Program Name: DateFifthTry.java

* Programmer Name: Thomas Godden

* Description: A class that contains date reading, writing and interpreting methods

* Date: 4/3/2018

---------------------------------------------------------------------------------------------------------------*/

//imports scanner
import java.util.Scanner;

public class DateFifthTry {
	//Declares variables
	private String month;
	private int day;
	private int year;
	
	public void writeOutput(){
		System.out.println(month + " " + day + ", " + year);
	}
	
	public void readInput(){
		boolean tryAgain = true;
		Scanner keyboard = new Scanner(System.in);
		while (tryAgain){
			System.out.println("Enter month, day, and year");
			System.out.println("as three integers:");
			System.out.println("do not use commas or other punctuations.");
			int monthInput = keyboard.nextInt();
			int dayInput = keyboard.nextInt();
			int yearInput = keyboard.nextInt();
			if(dateOK(monthInput, dayInput, yearInput)){
				setDate(monthInput, dayInput,yearInput);
				tryAgain = false;
			}else
				System.out.println("Illegal date. Reenter input.");
		}
	}
	
	public void setDate(int month, int date, int year){
		if (dateOK(month, date, year)){
			this.month = monthString(month);
			this.day = day;
			this.year = year;
		}else{
			System.out.println("Fatal Error");
			System.exit(0);
		}
	}
	
	public void setMonth(int monthNumber){
		if((monthNumber <=0)|| (monthNumber > 12)){
			System.out.println("Fatal Error");
			System.exit(0);
		}else{
			month = monthString(monthNumber);
		}
	}
	
	public void setDay(int day){
		if((day<=0) || (day>31)){
			System.out.println("Fatal Error");
			System.exit(0);
		}else
			this.day = day;
	}
	
	public void setYear(int year){
		if((year<=1000) || (year>9999)){
			System.out.println("Fatal Error");
			System.exit(0);
		}else
			this.year = year;
	}
	
	//Defines the toString method
	public String toString()
	{
		//Returns "[month] [day], [year]"
		return(month + " " + day + ", " + year);
	}
	
	//Defines the equals class
	public boolean equals(DateFifthTry otherDate){
		//Return a boolean value depending on if the date equals otherDate
		return((month.equalsIgnoreCase(otherDate.month)) && (day == otherDate.day) && (year == otherDate.year));
	}
	
	public boolean precedes(DateFifthTry otherDate){
		//Return a boolean value depending on if the date is before otherDate
		return( (year<otherDate.year) || (year == otherDate.year && getMonth() < otherDate.getMonth()) || (year == otherDate.year && month.equals(otherDate.month) && day<otherDate.day) );
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
	
	private boolean dateOK(int monthInt, int dayInt, int yearInt){
		return (((monthInt >=1)&&(monthInt<=12)) && ((dayInt >=1)&&(monthInt<=31)) && ((yearInt >=1000)&&(yearInt<=9999)));
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
