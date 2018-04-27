/*------------------------------------------------------------------------------------------------------------

* Program Name: InheritanceDemo.java

* Programmer Name: Thomas Godden

* Description: To test the hourlyEmployee class

* Date: 4/26/2018

---------------------------------------------------------------------------------------------------------------*/
public class InheritanceDemo{
	public static void main(String[] args){
		//Instantiates a new hourly employee named joe
		HourlyEmployee joe = new HourlyEmployee("Joe Worker", new Date("January", 1, 2015), 50.50, 160);
		
		//Displayes joe's name and that we are now changing it
		System.out.println("joe's longer name is " + joe.getName());
		System.out.println("Changing joe's name to Josephine");
		//Changing his name
		joe.setName("Joesaphine");
		
		//Prints out joes record
		System.out.println("Joe's record is as follows:");
		System.out.println(joe);
	}
}