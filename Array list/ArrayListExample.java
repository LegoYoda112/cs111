import java.util.ArrayList;

public class ArrayListExample {
	public static int countOccurrences(ArrayList<Character> array, char ch) {
		int chCount=0;
			for (int loopCount=0; loopCount<array.size(); loopCount++) {
				if(array.get(loopCount) == ch ) {
					chCount=chCount+1;
				}
			}
		return chCount;
	}
	public static void main(String [] args) {
		ArrayList<Character> myChars = new ArrayList<Character>();
		myChars.add('c');
		myChars.add('b');
		myChars.add('b');
		myChars.add('a');
		char myCh = 'b';
		int count = countOccurrences(myChars,myCh);
		System.out.println("The number of occurrences is: "+count);
	}
}