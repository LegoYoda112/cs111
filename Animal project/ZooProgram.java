public class ZooProgram{
	public static void main(String[] args){
		Zoo myZoo = new Zoo("My zoo",2);
		
		myZoo.getPen(1).addAnimal(new Dog1("Rover"));
		myZoo.getPen(1).addAnimal(new Dog1("Spot"));
		myZoo.getPen(1).setName("Dog pen");
		myZoo.getPen(1).sayHello();
		myZoo.getPen(0).setCapacity(40);
		
		System.out.println("Printing the contents of My zoo:");
		System.out.println(myZoo);
	}
}