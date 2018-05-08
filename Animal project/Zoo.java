import java.util.ArrayList;

public class Zoo{
	private ArrayList<Pen> pens = new ArrayList<Pen>();
	String zooName;
	
	public Zoo(String name, int numberOfPens){
		for(int i = 0; i<numberOfPens; i++){
			pens.add(new Pen(10));
		}
		
		zooName = name;
	}
	
	public Zoo(String name, int numberOfPens, int sizeOfPens){
		for(int i = 0; i<numberOfPens; i++){
			pens.add(new Pen());
		}
		
		zooName = name;
	}
	
	public Pen getPen(int index){
		return pens.get(index);
	}
	
	public void addPen(Pen aPen){
		pens.add(aPen);
	}
	
	public void addAnimalToPen (int index, Animal1 animal){
		pens.get(index).addAnimal(animal);
	}
	
	public String toString(){
		String returnString = "_____ ZOO: \""+ zooName +"\" ______\n";
		
		for(int i = 0; i<pens.size(); i++){
			returnString += ("Pen #" + (i+1) + ": \n");
			returnString += (getPen(i) + "\n");
		}
		
		return returnString;
	}
}