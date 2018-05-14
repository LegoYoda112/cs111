public abstract class Animal1{
	private String animalName;
	private String animalSpecies;
	public int numberOfLegs;
	
	//Relative animal size ranging from 1 to 10, with 1 being a Lizard and 10 being an elephant
	public int animalSize;
	
	public Animal1(String name){
		animalName = name;
		numberOfLegs = 4;
	}
	
	public Animal1(String name, int legs){
		animalName = name;
		numberOfLegs = legs;
		animalSpecies = "";
	}
	
	public Animal1(String name, int legs, String type, int size){
		animalName = name;
		numberOfLegs = legs;
		animalSpecies = type;
		animalSize = size;
	}
	
	public String getName(){
		return animalName;
	}
	
	public int getLegs(){
		return numberOfLegs;
	}
	
	public int getSize(){
		return animalSize;
	}
	
	public String getSpecies(){
		return animalSpecies;
	}
	
	public boolean isAMammal(){
		return true;
	}
	
	public boolean isCarnivorous(){
		return true;
	}
	
	public abstract String getHello();
	
	public String toString(){
		return ("|Species: " + animalSpecies + "|Name: \"" + animalName + "\"|Number of legs: " + numberOfLegs + "|Carnivorous: " + isCarnivorous()+ "|Mammal: " + isAMammal() +"| Size: " + animalSize +"|");
	}
}