import java .util .*;
class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a 7 letter word");
		String word = input.nextLine(); //Input collected from user

		for (int loop = 0; loop < 7; loop++)
		{
			for (int nestedLoop = 0; nestedLoop < loop; nestedLoop++) { //Nested loop created to print out changing output
				System.out.print(word.charAt(nestedLoop)); //Each letter printed out using .charAt and the loop number		    
			}
			System.out.print(word.charAt(loop )); //Original loop index printed after as it is always one index more than the nested loop
			System.out.print("\n");
		}
	}
}