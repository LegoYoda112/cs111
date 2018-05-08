/*------------------------------------------------------------------------------------------------------------

* Program Name: SalesData.java

* Programmer Name: Thomas Godden

* Description: Creates an array of events and prints out its contents

* Date: 5/7/2018

---------------------------------------------------------------------------------------------------------------*/

import java.util.Scanner;

public class SalesData{
	public static void main(String args[]){
		//Creates a scanner
		Scanner scan = new Scanner(System.in);
		
		//Month dada and max index variables
		double[] monthData = new double[12];
		int maxIndex = 0;
		
		//Prompts the user for the data and keeps track of the maximum  index
		for(int i = 0; i < monthData.length; i++){
			System.out.print("Please enter the data for month " + (i+1) + ": ");
			monthData[i] = scan.nextDouble();
			if(monthData[i] > monthData[maxIndex]){
				maxIndex = i;
			}
		}
		
		//Prints out the quarterly data
		System.out.println("The first quarter total is " + (monthData[0] + monthData[1] + monthData[2]));
		System.out.println("The second quarter total is " + (monthData[3] + monthData[4] + monthData[5]));
		System.out.println("The third quarter total is " + (monthData[6] + monthData[7] + monthData[8]));
		System.out.println("The fourth quarter total is " + (monthData[9] + monthData[10] + monthData[11]));
		
		//Calculates the total sum
		double sum = 0;
		for(double month : monthData){
			sum += month;
		}
		
		//Prints out the Anual sales total
		System.out.println("The Anual Sales Total is: " + sum);
		
		//Prints out the index of the max and the value
		System.out.println("Month #" + (maxIndex+1) + " was the highest with a total of " + monthData[maxIndex]);
	}
}