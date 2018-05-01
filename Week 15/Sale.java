/*------------------------------------------------------------------------------------------------------------

* Program Name: Sale.java

* Programmer Name: Thomas Godden

* Description: A class for storing and manipulating sales

* Date: 5/1/2018

---------------------------------------------------------------------------------------------------------------*/

//Sale class
public class Sale{
	//Name and price variables
	private String name;
	private double price;
	
	
	//No arg constructor
	public Sale(){
		name = "No name yet";
		price = 0;
	}
	
	//Full constructor
	public Sale(String theName, double thePrice){
		setName(theName);
		setPrice(thePrice);
	}
	
	//Duplicating constructor
	public Sale (Sale originalObject){
		if(originalObject == null){
			//Will throw an error if you pass it an empty object
			System.out.println("Error: null Sale object.");
			System.exit(0);
		}
		name = originalObject.name;
		price = originalObject.price;
	}
	
	//Prints out what class it is
	public static void announcement(){
		System.out.println("This is the Sale class");
	}
	
	//Returns price
	public double getPrice(){
		return price;
	}
	
	//Sets price
	public void setPrice(double newPrice){
		if(newPrice >= 0){
			price = newPrice;
		}else{
			//Will throw an error if price is less then 0
			System.out.println("Error: negative Price");
			System.exit(0);
		}
	}
	
	//Returns name
	public String getName(){
		return name;
	}
	
	//Sets name
	public void setName(String newName){
		if(newName != null && newName != ""){
			name = newName;
		}else{
			//Will throw an error if name is empty
			System.out.println("Error: Improper name value.");
			System.exit(0);
		}
	}
	
	//Returns the string representation of Sale
	public String toString(){
		return (name + " Price and total cost = $" + price);
	}
	
	//Returns price
	public double bill(){
		return price;
	}
	
	//Checks if the Sale equals another sale object
	public boolean equalDeals(Sale otherSale){
		if(otherSale == null){
			return false;
		}else{
			return (name.equals(otherSale.name) && bill() == otherSale.bill());
		}
	}
	
	//Checks if Sale is less then another sale object
	public boolean lessThan(Sale otherSale){
		if(otherSale == null){
			//Throws an error if otherSale is empty
			System.out.println("Error: null Sale object");
			System.exit(0);
		}
		
		return (bill() < otherSale.bill());
	}
	
	//Checks if Sale is equal to another object
	public boolean equals (Object otherObject){
		if(otherObject == null){
			//If the other object is empty, return false
			return false;
		}else if (getClass() != otherObject.getClass()){
			//If the other object has a different class type return false
			return false;
		}else{
			//If the other object is equal in type, then check individual fields
			Sale otherSale = (Sale) otherObject;
			return (name.equals(otherSale.name) && price == otherSale.price);
		}
	}
}