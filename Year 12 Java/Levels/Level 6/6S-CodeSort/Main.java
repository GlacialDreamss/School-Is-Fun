import java.util.*;
class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 

		LinkedList<Integer> codes = new LinkedList<Integer>(); 
		LinkedList<Integer> codesSorted = new LinkedList<Integer>(); //Linkedlists for the original codes and sorted codes created

		int min = 100;
		int max = 999;

		System.out.println("A or D");
		String choice = input.nextLine();

		for (int loop = 0; loop != 10; loop++){ //10 random codes within the range generated
			int ranInt = min + (int) (Math.random() * (max - min + 1));
			
			codes.add(ranInt);
			codesSorted.add(ranInt);
		}
		
		if(choice.equals("D")){
			for(int index = 0; index < codes.size(); index++) //This loop represents the index value of the code to be compared against

				for(int index2 = 0; index2 < codes.size(); index2++){ //This loop represnsts the index value of the code being used to compare

					if(codesSorted.get(index) > codesSorted.get(index2)) //If the code being used to compare is greater than the code being compared against it replaces it 
					{
						int placeholder = codesSorted.get(index);
						codesSorted.set(index, codesSorted.get(index2));
						codesSorted.set(index2, placeholder);
					}
				}
		}
		
		if(choice.equals("A")){ //The same as the sorting above but for ascending order instead
			for(int index = 0; index < codes.size(); index++)

				for(int index2 = 0; index2 < codes.size(); index2++){ 

					if(codesSorted.get(index) < codesSorted.get(index2)) 
					{
						int placeholder = codesSorted.get(index);
						codesSorted.set(index, codesSorted.get(index2));
						codesSorted.set(index2, placeholder);
					}
				}

		}
		System.out.println("The unsorted list\n"+codes);
		System.out.println("The sorted list\n"+codesSorted); //The lists are output
		
	}
}