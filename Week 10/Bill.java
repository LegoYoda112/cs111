import java.util.Scanner;

public class Bill{
	public static final double RATE = 150.00;
	
	private int hours;
	private int minutes;
	private double fee;
	
	public void inputTimeWorked(){
		System.out.println("Enter the number of full hours worked");
		System.out.println("followed by the number of minutes:");
		Scanner keyboard = new Scanner(System.in);
		hours = keyboard.nextInt();
		minutes = keyboard.nextInt();
	}
	
	private double computeFee(int hoursWorked, int minutesWorked){
		minutesWorked = hoursWorked*60+minutesWorked;
		int quarterHours = minutesWorked/15;
		return quarterHours*RATE;
	}
	
	public void updateFee(){
		fee = computeFee(hours, minutes);
	}
	
	public void outputBill(){
		System.out.println("Time worked: ");
		System.out.println(hours + " hours and " + minutes + " minutes");
		System.out.println("Rate: $"+RATE + " per quarter hour.");
		System.out.println("Amount due: $" + fee);
	}
}