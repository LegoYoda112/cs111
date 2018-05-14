public class ZooProgram{
	public static void main(String[] args){
		Zoo myZoo = new Zoo("My zoo",2);
		
		myZoo.getPen(0).setCapacity(40);
		myZoo.getPen(0).addAnimal(new Cat1("Mittens"));
		myZoo.getPen(0).addAnimal(new Dog1("Spot"));
		myZoo.getPen(0).addAnimal(new Sheep1("Wolley"));
		myZoo.getPen(0).addAnimal(new Duck1("Donald"));
		
		myZoo.getPen(1).addAnimal(new Duck1("Quackers"));
		myZoo.getPen(1).addAnimal(new Dog1("Spot"));
		myZoo.getPen(1).setName("Duck pen");
		myZoo.getPen(1).sayHello();
		
		myZoo.addPen(new Pen("Sheep pen", 20));
		myZoo.getPen(2).addAnimal(new Sheep1("Bob"));
		myZoo.getPen(2).addAnimal(new Sheep1("John"));
		myZoo.getPen(2).addAnimal(new Sheep1("Joe"));
		
		myZoo.addPen(new Pen("Unsafe sheep pen", 20));
		myZoo.getPen(3).addAnimal(new Sheep1("Frank"));
		myZoo.getPen(3).addAnimal(new Sheep1("Joan"));
		myZoo.getPen(3).addAnimal(new Sheep1("James"));
		myZoo.getPen(3).addAnimal(new Dog1("Wolf"));
		
		System.out.println("Printing the contents of My zoo:");
		System.out.println(myZoo);
		System.out.println(myZoo.displayConflicts());
		
		System.out.println("Trying to put another sheep into the \"unsafe sheep pen\", which is 1 away from max capacity");
		myZoo.getPen(3).addAnimal(new Sheep1("Neil"));
	}
}