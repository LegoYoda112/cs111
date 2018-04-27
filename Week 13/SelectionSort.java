
/*------------------------------------------------------------------------------------------------------------

* Program Name: SelectoinSort.java

* Programmer Name: Thomas Godden

* Description: A selectoin sort class

* Date: 4/23/2018

---------------------------------------------------------------------------------------------------------------*/

public class SelectionSort{
	//Main selectoin sort method
	public static void sort(double[] a, int numberUsed){
		int index, indexOfNextSmallest;
		for(index = 0; index<numberUsed - 1; index++){
			//Loops through the array, finds the smallest value and puts it at the index positoin
			indexOfNextSmallest = indexOfSmallest(index, a, numberUsed);
			interchange(index, indexOfNextSmallest, a);
		}
	}
	
	//Finds the smallest index of an array
	private static int indexOfSmallest(int startIndex, double[] a, int numberUsed){
		//Sets the min to be the start index
		double min = a[startIndex];
		int indexOfMin = startIndex;
		int index;
		//Loops through the array
		for(index = startIndex + 1; index < numberUsed; index++){
			//If a new min is found, set that to be the indexOfMin
			if(a[index] < min){
				min = a[index];
				indexOfMin = index;
			}
		}
		//Returns the index of the min value
		return indexOfMin;
	}
	
	//Swaps the values from the given indexes and array
	private static void interchange(int i, int j, double[] a){
		double temp;
		temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}