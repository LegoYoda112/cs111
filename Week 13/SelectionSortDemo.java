/*------------------------------------------------------------------------------------------------------------

* Program Name: SelectoinSortDemo.java

* Programmer Name: Thomas Godden

* Description:Demonstrates the selectoin sort class

* Date: 4/23/2018

---------------------------------------------------------------------------------------------------------------*/

public class SelectionSortDemo{
	public static void main(String[] args){
		//Array to sort
		double[] b = {7.7,5.5,11, 3, 16, 4.4,20,14,13,42};
		
		//Prints out the array before sorting
		System.out.println("Array contents before scoring:");
		int i;
		for(i = 0; i< b.length; i++)
			System.out.println(b[i] + " ");
		System.out.println();
		
		//Sorts the array
		SelectionSort.sort(b, b.length);
		
		//Prints out the sorted array
		System.out.println("Sorted array values:");
		for(i = 0; i<b.length; i++)
			System.out.println(b[i] + " ");
		System.out.println();
	}
}