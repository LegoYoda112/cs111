/*------------------------------------------------------------------------------------------------------------

* Program Name: WhileDemo.java

* Programmer Name: Thomas Godden

* Description: To gain some practice using if else structures

* Date: 3/5/2018

---------------------------------------------------------------------------------------------------------------*/


public class WhileDemo{
	public static void main(String[] args){
		int countDown;
		
		//Loops until countDown is less then 0, which means it runs 3 times
		System.out.println("First while loop:");
		countDown = 3;
		while (countDown > 0){
			System.out.println("Hello");
			countDown = countDown - 1;
		}
		
		//Loops until countDown is less then 0, which means it terminates immedietly
		System.out.println("Second while loop:");
		countDown = 0;
		while (countDown > 0){
			System.out.println("Hello");
			countDown = countDown  - 1;
		}
		
		//Loops until countDown is less then 0 at the end of the loop which means it runs 3 times
		System.out.println("First do-while loop:");
		countDown = 3;
		do{
			System.out.println("Hello");
			countDown = countDown - 1;
		} while (countDown > 1);
		
		//Loops untill countDown is less then 0 at the end of the loop which means it runs once then terminates
		System.out.println("Second do-while loop:");
		countDown = 0;
		do {
			System.out.println("Hello");
			countDown = countDown  - 1;
		} while (countDown > 0);
	}
	
}