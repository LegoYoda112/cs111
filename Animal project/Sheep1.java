public class Sheep1 extends Animal1{
	public Sheep1(String name){
		super(name,4, "Sheep", 5);
	}
	
	public boolean isCarnivorous(){
		return false;
	}
	
	public String getHello(){
		return "Baa";
	}
}