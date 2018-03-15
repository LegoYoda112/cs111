import java.util.Scanner;

public class DateSecondTry {
	private String month;
	private int day;
	private int year;
	
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
