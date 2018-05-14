import java.util.ArrayList;

public class Pen{
	private ArrayList<Animal1> animals = new ArrayList<Animal1>();
	private String penName;
	private int maxSpace;
	
	public Pen(){
		penName = "Pen";
		maxSpace = 20;
	}
	
	public Pen(int size){
		penName = "Pen";
		maxSpace = size;
	}
	
	public Pen(String name, int size){
		penName = name;
		maxSpace = size;
	}
	
	public void addAnimal (Animal1 animal){
		if(isSpaceFor(animal)){
			animals.add(animal);
		}else{
			System.out.println("Error, trying to add an animal to a full pen, exiting");
			System.exit(0);
		}
	}
	
	public Animal1 getAnimal (int index){
		return animals.get(index);
	}
	
	public int getSpaceUsed(){
		int sum = 0;
		for(Animal1 animal : animals){
			sum += animal.getSize();
		}
		return sum;
	}
	
	public int getSpaceLeft(){
		return maxSpace - getSpaceUsed();
	}
	
	public boolean isSpaceFor(int animalSize){
		return (getSpaceLeft()>animalSize);
	}
	
	public boolean isSpaceFor(Animal1 animal){
		return isSpaceFor(animal.getSize());
	}
	
	public void setName(String name){
		penName = name;
	}
	
	public void setCapacity(int size){
		maxSpace = size;
	}
	
	public void sayHello(){
		for(Animal1 animal : animals){
			System.out.println(animal.getHello());
		}
	}
	
	public String toString(){
		String returnString = "";
		returnString += ("|Pen: \"" + penName + "\"|Size: " + maxSpace + "|Space used: " + getSpaceUsed() + "|Space remaining: " + getSpaceLeft() + "| \n");
		
		returnString += "  Contents:\n";
		
		for(int i = 0; i<animals.size(); i++){
			returnString += ("  Animal #" + (i+1) + ": \n");
			returnString += "    " + getAnimal(i) + "\n";
		}
		
		return returnString;
	}
	
	public boolean hasCarnivorous(){
		for(Animal1 animal : animals){
			if(animal.isCarnivorous()){
				return true;
			}
		}
		return false;
	}
	
	public boolean hasNonCarnivorous(){
		for(Animal1 animal : animals){
			if(!animal.isCarnivorous()){
				return true;
			}
		}
		return false;
	}
	
	public boolean hasConflict(){
		if(hasCarnivorous() && hasNonCarnivorous()){
			return true;
		}
		
		return false;
	}
	
	public ArrayList<Animal1>  getNonCarnivorous(){
		ArrayList<Animal1> nonCarnivores = new ArrayList<Animal1>();
		
		for(Animal1 animal : animals){
			if(!animal.isCarnivorous()){
				nonCarnivores.add(animal);
			}
		}
		
		return nonCarnivores;
	}
}