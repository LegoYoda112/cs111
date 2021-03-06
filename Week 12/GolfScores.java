/*------------------------------------------------------------------------------------------------------------

* Program Name: GolfScores.java

* Programmer Name: Thomas Godden

* Description: Gets up to 10 golf scores and displayes their difference from the average score

* Date: 4/14/2018

---------------------------------------------------------------------------------------------------------------*/

//imports scanner
import java.util.Scanner;

public class GolfScores{
	//The max number of scores that can be inputted
	public static final int MAX_NUMBER_SCORES = 10;
	
	//Main method
	public static void main(String[] args){
		//Array to hold the scores
		double[] score = new double[MAX_NUMBER_SCORES];
		//integer to hold the number of scores used out of the max
		int numberUsed;
		
		//Prompts the user for the scores
		System.out.println("This program reads gold scores and shows");
		System.out.println("how much each differes from the average");
		System.out.println("Enter golf scores");
		//Fills the array and assigns numberUsed
		numberUsed = fillArray(score);
		//Displays the difference
		showDifference(score, numberUsed);
	}
	
	//Fills the scores array and returns the number of spots used
	public static int fillArray(double[] a){
		//Prompts the user for a list of scores
		System.out.println("Enter up to " + a.length + " nonnegative numbers.");
		
		System.out.println("Mark the end of the list with a negative number.");
		Scanner keyboard = new Scanner(System.in);
		
		double next;
		int index = 0;
		
		//Assigns values untill it hits a negative score and then ends
		next = keyboard.nextDouble();
		while((next >=0) && (index < a.length)){
			a[index] = next;
			index++;
			next = keyboard.nextDouble();
		}
		
		//If there is still more scores, let the user know that some were cutoff
		if(next >= 0)
			System.out.println("Could only read in" + a.length + " input values.");
		
		//Returns how many spots were used
		return index;
	}
	
	//Computes the average of the given array and number of items used within that array
	public static double computeAverage(double[] a, int numberUsed){
		double total = 0;
		//Calculates total
		for (int index = 0; index < numberUsed; index++)
			total = total + a[index];
		//If the number of used is not 0, then calculate the average
		if(numberUsed>0){
			return (total/numberUsed);
		}else{
			//If not then then ouput an error and return a 0
			System.out.println("ERROR: Trying to average 0 numbers.");
			System.out.println("computeAverage returns 0.");
			return 0;
		}
	}
	
	
	//Ouputs the difference between the average of the given array and the items in that array
	public static void showDifference(double a[], int numberUsed){
		
		//Gets the average and displayes it
		double average = computeAverage(a, numberUsed);
		System.out.println("Average of the " + numberUsed + " Scores = " + average);
		
		//Loops through the array and outputs the difference between the average
		System.out.println("The scores are:");
		for (int index = 0; index<numberUsed; index++)
			System.out.println(a[index] + " differes from average by " + (a[index] - average));
	}
}