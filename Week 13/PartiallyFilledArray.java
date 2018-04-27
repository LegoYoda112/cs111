/*------------------------------------------------------------------------------------------------------------

* Program Name: PartiallyFilledArray.java

* Programmer Name: Thomas Godden

* Description: A class that acts as a partially filled array 

* Date: 4/23/2018

---------------------------------------------------------------------------------------------------------------*/


public class PartiallyFilledArray
{
	//The max number of elements
	private int maxNumberElements;
	//The array that will be holding our elememtns
	private double[] a;
	//The number of indexes used
	private int numberUsed;
	
	//No argumnent constructor
	PartiallyFilledArray(){
		maxNumberElements = 10;
		a = new double[maxNumberElements];
		numberUsed = 0;
	}
	
	//Constructor that recives an array size
	PartiallyFilledArray(int arraySize){
		if (arraySize <= 0){
			System.out.println("Error Array size zero or negative");
			System.exit(0);
		}
		maxNumberElements = arraySize;
		a = new double[maxNumberElements];
		numberUsed = 0;
	}
	
	//Constructor that copies an existing particlly filled array
	PartiallyFilledArray (PartiallyFilledArray original){
		if(original == null){
			System.out.println("Fatal error: aborting program");
			System.exit(0);
		}
		maxNumberElements = original.maxNumberElements;
		numberUsed = original.numberUsed;
		a = new double[maxNumberElements];
		for(int i = 0; i< numberUsed; i ++)
			a[i] = original.a[i];
	}
	
	
	//Method to add a new element
	public void add(double newElement){
		if (numberUsed >= a.length){
			System.out.println("Error: Adding to a full array.");
			System.exit(0);
		}else{
			a[numberUsed] = newElement;
			numberUsed++;
		}
	}
	
	//Method to return an element at a specified index
	public double getElement(int index){
		if(index < 0 || index >= numberUsed){
			System.out.println("Error: Illegal or unused index");
			System.exit(0);
		}
		return a[index];
	}
	
	//Method to change an element at a specified index
	public void resetElement (int index, double newValue){
		if(index < 0 || index >=maxNumberElements){
			System.out.println("Error Illegal index");
			System.exit(0);
		}else if (index > numberUsed){
			System.out.println("Error: Changing an index that is too large.");
			System.exit(0);
		}else
			a[index] = newValue;
	}
	
	//Method to delete the element at the end of the array
	public void deleteLast(){
		if(empty()){
			System.out.println("Error: Deleting from an empty array.");
		}else
			numberUsed--;
	}
	
	
	//Method to delete an element at a specified index
	public void delete(int index){
		if(index < 0 || index>=numberUsed){
			System.out.println("Error: Illegal or unused index");
			System.exit(0);
		}
		
		for(int i = index; i < numberUsed; i++)
			a[i] = a[i + 1];
			
		numberUsed--;
	}
	
	//Returns true if the array is empty
	public boolean empty(){
		return (numberUsed == 0);
	}
	
	//Returns true if the array is full
	public boolean full(){
		return (numberUsed == maxNumberElements);
	}
	
	//Returns the max number of elements the array can hold
	public int getMaxCapacity(){
		return maxNumberElements;
	}
	
	//Returns the number of elements used
	public int getNumberElements(){
		return numberUsed;
	}
}