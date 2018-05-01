/*------------------------------------------------------------------------------------------------------------

* Program Name: DiscountSale.java

* Programmer Name: Thomas Godden

* Description: A class for storing and manipulating discount sales, extends sale

* Date: 5/1/2018

---------------------------------------------------------------------------------------------------------------*/


//Discount sale class
public class DiscountSale extends Sale{
	//Discount variable
	private double discount;
	
	//No arg constructor
	public DiscountSale(){
		super();
		discount = 0;
	}
	
	//Full constructor
	public DiscountSale(String theName, double thePrice, double theDiscount){
		super(theName, thePrice);
		setDiscount(theDiscount);
	}
	
	//Duplicating constructor
	public DiscountSale(DiscountSale originalObject){
		super(originalObject);
		discount = originalObject.discount;
	}
	
	//Prints out what class it is in
	public static void announcement(){
		System.out.println("This is the DiscountSale class.");
	}
	
	//Calculates and returns the bill given price and discount
	public double bill(){
		double fractoin = discount/100;
		return (1 - fractoin)*getPrice();
	}
	
	//Returns the discount
	public double getDiscount(){
		return discount;
	}
	
	//Sets the discount
	public void setDiscount (double newDiscount){
		if (newDiscount >=0){
			discount = newDiscount;
		}else{
			//Will throw an error if newDiscount is less then 0
			System.out.println("Error: Negative discout.");
			System.exit(0);
		}
	}
	
	//Returns the string reperesentatoin of DiscountSale
	public String toString(){
		return (getName() + " Price = $" + getPrice() + " Discount = " + discount + "%\n" + " total cost = $" + bill());
	}
}