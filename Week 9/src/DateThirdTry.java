import java.util.Scanner;

public class DateThirdTry {
	private String month;
	private int day;
	private int year;
	
	public void setDate (int newMonth, int newDay, int newYear){
		month = monthString(newMonth);
		day = newDay;
		year = newYear;
	}
	
	public String monthString(int monthNumber){
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
			System.out.println("Fatal error");
			System.exit(0);
			return "Error";
		}
	}
	
	public void writeOutput(){
		System.out.println(month + " " + day + ", " + year);
	}
	
	public void readInput()
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter month, day and year.");
		System.out.println("Do not use a comma.");
		month = keyboard.next();
		day = keyboard.nextInt();
		year = keyboard.nextInt();
	}
	
	public int getDay(){
		return day;
	}
	
	public int getYear(){
		return year;
	}
	
	public int getMonth(){
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
			System.out.println("Fatal error");
			System.exit(0);
			return 0;
		}
	}
}
