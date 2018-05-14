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
	
//	public void removeAnimalFromPen(int penIndex, int animalIndex){
//		pens.get(penIndex).removeAnimal(animalIndex);
//	} 
	
	public ArrayList getConflicts(){
		ArrayList conflicts = new ArrayList();
		for(int i = 0; i<pens.size(); i++){
			if(pens.get(i).hasConflict()){
				conflicts.add(pens.get(i).getNonCarnivorous());
			}
		}
		
		return conflicts;
	}
	
	public String displayConflicts(){
		String returnString = "Conflicts:\n";
		
		ArrayList conflicts = new ArrayList();
		
		for(int i = 0; i<pens.size(); i++){
			if(pens.get(i).hasConflict()){
				conflicts = pens.get(i).getNonCarnivorous();
				
				returnString += "WARNING!, ";
				if(conflicts.size() == 1){
					Animal1 conflict = (Animal1) conflicts.get(0);
					returnString += "a " +conflict.getSpecies() + " named \"" + conflict.getName() + "\", ";
				}else{
					for(int j = 0; j<conflicts.size()-1; j++){
						Animal1 conflict = (Animal1) conflicts.get(j);
						returnString += "a " + conflict.getSpecies() + " named \"" + conflict.getName() + "\", "; 
					}
					
					Animal1 conflict = (Animal1) conflicts.get(conflicts.size()-1);
					returnString += " and a " + conflict.getSpecies() + " named \"" + conflict.getName() + "\" "; 
				}
				
				
				returnString += "might get eaten in pen " + (i+1) + ".\n";
			}else{
				returnString += "Pen " + (i+1) + " has no conflicts.\n";
			}
		}
		
		return returnString;
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