/*------------------------------------------------------------------------------------------------------------

* Program Name: CointFlipDemo.java

* Programmer Name: Thomas Godden

* Description: To demo the random functoin

* Date: 3/5/2018

---------------------------------------------------------------------------------------------------------------*/
//imports the random class
import java.util.Random;
public class CoinflipDemo
{
	public static void main(String[] args){
		//creates a new ranodm number generator
		Random randomGenerator = new Random();
		//Inits the counter to 1
		int counter = 1;
		
		//While the counter is less then 5, output heads or tails depending on if coinFlip is 1 or 2
		while (counter <= 5){
			System.out.print("Flip number " + counter + ": ");
			int coinFlip = randomGenerator.nextInt(2);
			if (coinFlip == 1){
				System.out.println("Heads");
			}else{
				System.out.println("Tails");
			}
			counter++;
		}
	}	
}