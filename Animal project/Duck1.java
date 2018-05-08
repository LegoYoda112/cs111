public class Duck1 extends Animal1{
	public Duck1(String name){
		super(name, 2, "Duck", 3);
	}
	
	public boolean isAMammal(){
		return false;
	}
	
	public boolean isCarnivorous(){
		return false;
	}
	
	public String getHello(){
		return "Quack";
	}
}