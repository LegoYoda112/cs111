public class Elephant1 extends Animal1{
	public Sheep1(String name){
		super(name, 4, "Elephant", 10);
	}
	
	public boolean isCarnivorous(){
		return false;
	}
	
	public String getHello(){
		return "*Instert trumpeting noise here*";
	}
}