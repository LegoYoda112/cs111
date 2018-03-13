/*------------------------------------------------------------------------------------------------------------

* Program Name: Averager.java

* Programmer Name: Thomas Godden

* Description: Averages numbers

* Date: 3/5/2018

---------------------------------------------------------------------------------------------------------------*/
//Imports scanner
import java.util.Scanner;
public class Averager
{
	public static void main(String[] args){
		//Creates a new scanner called keyboard
		Scanner keyboard = new Scanner(System.in);
		//Prompts the user for a list of non-negative scores
		System.out.println("Enter a list of nonnegitive scores.");
		System.out.println("Mark the end with a negative number.");
		System.out.println("I will compute their average");
		
		//Initializes next, sum and count
		double next, sum = 0;
		int count=0;
		
		//Scanns for the next double
		next = keyboard.nextDouble();
		//While next is nonnegative, add it to sum increment the count and grab the next double
		while (next >= 0){
			sum = sum + next;
			count ++;
			next = keyboard.nextDouble();
		}
		
		if(count == 0){
			System.out.println("No scores entered"); //If the count is 0 then print, no scores entered
		}else{
			double average = sum/count; //If the count is greater then 0, then average and display the average
			System.out.println(count + " scores read.");
			System.out.println("The average is " + average);
		}
	}
}