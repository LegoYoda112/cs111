/*------------------------------------------------------------------------------------------------------------

* Program Name: DifferentEquals.java

* Programmer Name: Thomas Godden

* Description:Showing the difference in checking equality of arrays

* Date: 4/14/2018

---------------------------------------------------------------------------------------------------------------*/


public class DifferentEquals{
	public static void main(String[] args){
		
		//Two arrays of 10 elements
		int[] c = new int[10];
		int[] d = new int[10];
		
		//Counter
		int i;
		
		//Sets the arrays equal too [0,1,2,3,4,5,6,7,8,9]
		for(i=0; i < c.length; i++)
			c[i] = i;
		for(i=0; i < d.length; i++)
			d[i] = i;
		
		//Displays if c == d
		if(c == d)
			System.out.println("c and d are equal by ==.");
		else
			System.out.println("c and d are not equal by ==.");
		
		System.out.println(" == only tests memory adresses.");
		
		//Displays if c equals d using the equalArrays method we made
		if(equalArrays(c,d))
			System.out.println("c and d are equal by the equalArrays method.");
		else
			System.out.println("c and d are not equal by the equalArrays method.");
			
		System.out.println("An equalArrays method is usually a more useful test.");
	}
	
	//To test the equality of two integer arrays
	public static boolean equalArrays(int[] a, int[] b){
		
		//If the lengths are not equal, return false without moving on
		if(a.length != b.length)
			return false;
		else{
			//If they have the same length, increment through the arrays one by one and test the equality of their members
			int i = 0;
			while(i < a.length){
				//If any of them do not equal, return false
				if(a[i] != b[i])
					return false;
				i++;
			}
		}
		//If all the tests are passed, return true
		return true;
	}
}